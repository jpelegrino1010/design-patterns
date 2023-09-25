package com.example.designpatterns.builder;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;
}
