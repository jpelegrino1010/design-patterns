package com.example.designpatterns.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class EmailMsgListener implements EventListener {

    @Getter
    private final String email;

    @Override
    public void update() {
        System.out.println("Sending the email to "+ email);
    }

}
