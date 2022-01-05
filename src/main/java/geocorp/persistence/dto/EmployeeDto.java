package geocorp.persistence.dto;

import java.util.Set;

import geocorp.persistence.entities.Order;
import geocorp.persistence.entities.Person;
import geocorp.persistence.entities.Position;
import lombok.Data;

@Data
public class EmployeeDto {
    private Long id;
    private Person person;
    private String email;
    private String phoneNumber;
    private Position position;
    private Set<Order> order;
}
