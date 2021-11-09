package geocorp.persistence.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class CompanyAddress {


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
