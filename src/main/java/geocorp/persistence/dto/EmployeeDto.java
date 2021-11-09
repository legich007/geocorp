package geocorp.persistence.dto;

import geocorp.persistence.entities.JobPosition;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private JobPosition jobPosition;
    private LocalDate dateOfBirth;
}
