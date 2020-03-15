package com.kulankhin.demo.persistence.entities;

import com.google.common.base.Objects;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equal(id, employee.id) &&
                Objects.equal(firstName, employee.firstName) &&
                Objects.equal(middleName, employee.middleName) &&
                Objects.equal(lastName, employee.lastName) &&
                Objects.equal(email, employee.email) &&
                Objects.equal(phoneNumber, employee.phoneNumber) &&
                Objects.equal(jobPosition, employee.jobPosition) &&
                Objects.equal(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, firstName, middleName, lastName, email, phoneNumber, jobPosition, dateOfBirth);
    }
}
