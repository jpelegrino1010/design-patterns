package com.example.designpatterns.chainofresponsability;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ValidPasswordHandler extends Handler{

    private Database database;

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username,password)) {
            System.out.println("Wrong password");
        }
        return handleNext(username,password);
    }
}
