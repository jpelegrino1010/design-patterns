package com.example.designpatterns.singleResponsability.utils;

import com.example.designpatterns.singleResponsability.model.Employee;
import com.example.designpatterns.singleResponsability.enums.EmployeeType;
import org.springframework.stereotype.Component;

@Component
public class EmployeeValidator {

    public boolean validate(Employee employee) {
        return !employee.getEmployeeType().equals(EmployeeType.NORMAL);
    }

}
