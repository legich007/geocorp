package geocorp.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import geocorp.persistence.enums.LawType;
import lombok.Data;

@Entity
@Data
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @ManyToOne(optional = false)
    private Address actualAddress;

    @ManyToOne(optional = false)
    private Address legalAddress;

    @Column(nullable = false, length = 30)
    @Enumerated(EnumType.STRING)
    private LawType lawType;

    @Column(nullable = false)
    private String bankingDetails;
}
