package com.kulankhin.demo.persistence.entities;

import com.google.common.base.Objects;
import com.kulankhin.demo.persistence.enums.LawType;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;


    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private Set<JobOrder> jobOrders;

    @OneToMany(mappedBy = "mainCustomer", fetch = FetchType.LAZY)
    private Set<JobOrder> jobOrdersForMain;

    @ManyToOne(optional = false)
    private Director director;

    @ManyToOne(optional = false)
    private CompanyAddress companyAddress;


    @Column(nullable = false, length = 30)
    @Enumerated(EnumType.STRING)
    private LawType lawType;

    @Column(nullable = false)
    private String bankingDetails;





    //TODO: мне не понятно почему в JobOrder есть две ссылки на Customer (customer, mainCustomer),
    // но если нужно, то для этого нужно использовать "mappedBy" с именем поля в зависимом классе

    // Customer - это прямой заказчик работ, чаще всего компания-проектировщик, а mainCustomer - это
    // заказчик самого проектировщика, чаще всего какая-то госконтора

    //TODO: добавить остальные поля
}
