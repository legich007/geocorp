package com.kulankhin.demo.services.mappers;

import com.kulankhin.demo.persistence.dto.EmployeeDto;
import com.kulankhin.demo.persistence.entities.Employee;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee toEmployee(EmployeeDto employeeDto);

    EmployeeDto toEmployeeDto(Employee employee);

    Set<Employee> toEmployeeSet(Set<EmployeeDto> employeeDtoSet);

    Set<EmployeeDto> toEmployeeDtoSet(Set<Employee> employeeSet);
}
