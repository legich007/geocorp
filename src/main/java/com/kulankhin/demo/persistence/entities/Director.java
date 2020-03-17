package com.kulankhin.demo.persistence.entities;

import com.google.common.base.Objects;
import lombok.Data;
import sun.util.resources.Bundles;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data

public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String firstName;
    @Column
    private String middleName;
    @Column(nullable = false)
    private String lastName;

    @OneToMany
    private Set<Company> customerSet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return id == director.id &&
                Objects.equal(firstName, director.firstName) &&
                Objects.equal(middleName, director.middleName) &&
                Objects.equal(lastName, director.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, firstName, middleName, lastName);
    }
}
