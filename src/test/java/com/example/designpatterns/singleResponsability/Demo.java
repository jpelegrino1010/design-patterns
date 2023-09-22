package com.example.designpatterns.singleResponsability;

import com.example.designpatterns.singleResponsability.enums.EmployeeType;
import com.example.designpatterns.singleResponsability.model.Employee;
import com.example.designpatterns.singleResponsability.services.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Demo {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testSaveEmployee() {
        employeeService.saveEmployee(new Employee("Juan","Martinez", EmployeeType.DIRECTOR));
        employeeService.saveEmployee(new Employee("Juan","Martinez", EmployeeType.NORMAL));
        employeeService.saveEmployee(new Employee("Juan","Martinez", EmployeeType.MANAGER));
    }
}
