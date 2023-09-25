package com.example.designpatterns.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebBuilder implements UserBuilder{

    private String firstName;
    private String lastName;
    private String address;
    private String age;
    private UserDTO dto;

    @Override
    public UserBuilder firstName(String fname) {
        firstName=fname;
        return this;
    }

    @Override
    public UserBuilder lastName(String lname) {
        lastName=lname;
        return this;
    }

    @Override
    public UserBuilder address(Address address) {
        this.address= address.getStreet() +"\n"+ address.getHouseNumber() +"\n" +address.getCity()
        + "\n" + address.getState();
        return this;
    }

    @Override
    public UserBuilder birthday(LocalDate birthday) {
        Period period=Period.between(birthday,LocalDate.now());
        age=Integer.toString(period.getYears());
        return this;
    }

    @Override
    public UserDTO build() {
        dto= new UserWebDTO(firstName+" "+ lastName,address,age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
