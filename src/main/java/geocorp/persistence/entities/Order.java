package geocorp.persistence.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import geocorp.persistence.enums.ProjectStatus;
import lombok.Data;

@Entity
@Data
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 20)
    private String shortProjectTitle;

    @Column(length = 50)
    private String fullProjectTitle;

    @ManyToOne(optional = false)
    private Employee manager;

    @Column(nullable = false)
    private LocalDate dateOfOrder;

    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private ProjectStatus projectStatus;

    @Column(length = 20)
    private String contractNumber;

    @ManyToOne
    private Customer customer;

    @Column(precision = 10, scale = 2)
    private Double totalCostInContract;
}
