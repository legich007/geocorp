package geocorp.services;

import geocorp.persistence.dto.EmployeeDto;
import geocorp.persistence.entities.Employee;
import geocorp.persistence.repositories.EmployeeRepository;
import geocorp.services.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapperImpl;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository, EmployeeMapper employeeMapperImpl) {
        this.employeeRepository = employeeRepository;
        this.employeeMapperImpl = employeeMapperImpl;
    }


    public Set<EmployeeDto> getAll(){
        Set<EmployeeDto> employeeDtoSet = new HashSet<>();
        employeeRepository.findAll()
                .forEach(employee -> employeeDtoSet.add(employeeMapperImpl.toEmployeeDto(employee)));
        return employeeDtoSet;
    }

    public EmployeeDto getOne(String firstName){
        return employeeMapperImpl.toEmployeeDto(
                employeeRepository.findByFirstNameEquals(firstName)
        );
    }

    public EmployeeDto getById(Long id){
        return employeeMapperImpl.toEmployeeDto(
                employeeRepository.findById(id).orElseGet(null)
        );
    }

    @Transactional
    public void create(EmployeeDto employeeDto){
        Employee employee = employeeMapperImpl.toEmployee(employeeDto);
        employeeRepository.save(employee);
    }
}
