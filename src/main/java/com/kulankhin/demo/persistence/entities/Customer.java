package com.kulankhin.demo.persistence.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private Set<JobOrder> jobOrders;

    @OneToMany(mappedBy = "mainCustomer", fetch = FetchType.LAZY)
    private Set<JobOrder> jobOrdersForMain;

    //TODO: мне не понятно почему в JobOrder есть две ссылки на Customer (customer, mainCustomer),
    // но если нужно, то для этого нужно использовать "mappedBy" с именем поля в зависимом классе

    //TODO: добавить остальные поля
}
