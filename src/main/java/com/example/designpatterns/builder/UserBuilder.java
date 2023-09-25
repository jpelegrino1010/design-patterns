package com.example.designpatterns.builder;

import java.time.LocalDate;

public interface UserBuilder {
    UserBuilder firstName(String fname);
    UserBuilder lastName(String lname);
    UserBuilder address(Address address);
    UserBuilder birthday(LocalDate birthday);
    UserDTO build();
    UserDTO getUserDTO();
}
