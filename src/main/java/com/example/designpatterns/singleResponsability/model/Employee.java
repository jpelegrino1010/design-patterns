package com.example.designpatterns.singleResponsability.model;

import com.example.designpatterns.singleResponsability.enums.EmployeeType;
import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private String firstName;
    private String lastName;
    private EmployeeType employeeType;
}
