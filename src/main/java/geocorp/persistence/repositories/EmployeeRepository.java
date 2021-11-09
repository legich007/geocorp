package geocorp.persistence.repositories;

import geocorp.persistence.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findByFirstNameEquals(String firstName);
}
