package geocorp.persistence.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 10)
    private int postalCode;

    @ManyToOne(optional = false)
    private City city;

    @OneToMany(mappedBy = "legalAddress")
    private Set<Company> companies;

    @OneToMany(mappedBy = "actualAddress")
    private Set<Company> companiesAct;

    @Column(nullable = false)
    private String address;

}
