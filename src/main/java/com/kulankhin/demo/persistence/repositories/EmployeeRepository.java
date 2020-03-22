package com.kulankhin.demo.persistence.repositories;

import com.kulankhin.demo.persistence.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findByFirstNameEquals(String firstName);
}
