package com.kulankhin.demo.persistence.entities;


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

    @OneToMany
    private Set<Company> companies;

    @Column(nullable = false)
    private String address;

}
