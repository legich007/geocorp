package com.kulankhin.demo.persistence.entities;

import com.kulankhin.demo.persistence.enums.ProjectStatus;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
public class JobOrder implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 20)
    private String shortProjectTitle;

    @Column(length = 50)
    private String fullProjectTitle;

    @ManyToOne(optional = false)
    private Employee projectManager;

    @Column(nullable = false)
    private LocalDate dateOfOrder;

    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private ProjectStatus projectStatus;

    @Column(length = 20)
    private String contractNumber;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Customer mainCustomer;

    @Column(precision = 10, scale = 2)
    private Double totalCostInContract; //TODO: если нет нужды считать цену вместе с копейками, то лучше заменить на Integer
}
