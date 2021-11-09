package geocorp.persistence.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(length = 50)
    private String middleName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String phoneNumber;

    @ManyToOne(optional = false)
    private JobPosition jobPosition;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

}
