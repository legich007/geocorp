package geocorp.controllers;

import geocorp.persistence.dto.EmployeeDto;
import geocorp.services.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/employee")
@Api(value = "Employee controller")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    @ApiOperation(value = "get all employees")
    public ResponseEntity<Set<EmployeeDto>> getAll() {
        return new ResponseEntity<>(employeeService.getAll(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<EmployeeDto> getOne(@RequestParam String firstName) {
        return new ResponseEntity<>(employeeService.getOne(firstName), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getOne(@PathVariable Long id) {
        return new ResponseEntity<>(employeeService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> creatEmployee(@RequestBody EmployeeDto employee){
        employeeService.create(employee);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
