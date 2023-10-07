package com.example.designpatterns.chainofresponsability;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserExistsHandler extends Handler{

    private Database database;

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("This Username is not registered!");
            System.out.println("Sign up to our app now!");
        }
        return handleNext(username,password);
    }


}
