package com.example.designpatterns.builder;

import java.time.LocalDate;

public class Demo {

    public static void main(String[] args) {

        UserDTO userDTO=new UserWebBuilder()
                .firstName("Juan")
                .lastName("Martinez")
                .birthday(LocalDate.of(1980,11,25))
                .address(new Address.AddressBuilder().houseNumber("#25")
                        .city("Santo Domingo")
                        .street("Hector Jimenez")
                        .state("Prado Oriental")
                        .zipCode("10105")
                        .build())
                .build();

        System.out.println(userDTO.getName() + "\n" + userDTO.getAge() +"\n" + userDTO.getAddress());
    }


}
