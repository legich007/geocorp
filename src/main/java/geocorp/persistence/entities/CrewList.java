package geocorp.persistence.entities;

import geocorp.persistence.enums.LawType;
import geocorp.persistence.enums.PaymentType;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CrewList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 40)
    private String crewName;

    @Column(nullable = false, length = 30)
    private String contactPersonFirstName;

    @Column(nullable = false, length = 30)
    private String contactPersonLastName;

    @Column(nullable = false, length = 10)
    private int costForHa;

    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private LawType lawType;

    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @ManyToOne(optional = false)
    private City city;








}
