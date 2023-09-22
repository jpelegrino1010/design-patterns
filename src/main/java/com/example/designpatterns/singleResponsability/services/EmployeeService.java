package com.example.designpatterns.singleResponsability.services;


import com.example.designpatterns.singleResponsability.model.Employee;
import com.example.designpatterns.singleResponsability.utils.EmployeeValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeValidator employeeValidator;

    public void saveEmployee(Employee employee) {
        if (employeeValidator.validate(employee))
            System.out.println("Thank Sir "+ employee);
        else
        System.out.println(employee);
    }
}
