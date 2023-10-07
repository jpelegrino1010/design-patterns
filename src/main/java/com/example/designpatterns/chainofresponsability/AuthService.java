package com.example.designpatterns.chainofresponsability;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthService {
    private Handler handler;

    public boolean logIn(String username,String password) {
        if (handler.handle(username,password)) {
            System.out.println("Authorization was successful");
            return true;
        }
        return false;
    }
}
