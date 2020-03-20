package com.kulankhin.demo.persistence.entities;

import com.google.common.base.Objects;
import com.kulankhin.demo.persistence.enums.ProjectStatus;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

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
    private Company customer;

    @ManyToOne
    private Company mainCustomer;

    @Column(precision = 10, scale = 2)
    private Double totalCostInContract; //TODO: если нет нужды считать цену вместе с копейками, то лучше заменить на Integer

    @ManyToMany
    private Set<Geodesy> geodesies;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobOrder jobOrder = (JobOrder) o;
        return Objects.equal(id, jobOrder.id) &&
                Objects.equal(shortProjectTitle, jobOrder.shortProjectTitle) &&
                Objects.equal(fullProjectTitle, jobOrder.fullProjectTitle) &&
                Objects.equal(projectManager, jobOrder.projectManager) &&
                Objects.equal(dateOfOrder, jobOrder.dateOfOrder) &&
                projectStatus == jobOrder.projectStatus &&
                Objects.equal(contractNumber, jobOrder.contractNumber) &&
                Objects.equal(customer, jobOrder.customer) &&
                Objects.equal(mainCustomer, jobOrder.mainCustomer) &&
                Objects.equal(totalCostInContract, jobOrder.totalCostInContract);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, shortProjectTitle, fullProjectTitle, projectManager, dateOfOrder, projectStatus, contractNumber, customer, mainCustomer, totalCostInContract);
    }
}
