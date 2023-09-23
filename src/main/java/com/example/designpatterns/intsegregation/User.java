package com.example.designpatterns.intsegregation;

import lombok.Data;

@Data
public class User extends Entity {
    private String email;
    private String password;
}
