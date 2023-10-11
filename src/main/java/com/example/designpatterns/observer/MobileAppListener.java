package com.example.designpatterns.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MobileAppListener implements EventListener{

    private final String username;

    @Override
    public void update() {
        System.out.println("Pushing to phone "+ username);
    }
}
