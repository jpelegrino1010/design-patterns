package com.example.designpatterns.mediator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Runaway implements Command{

    private IATCMediator mediator;

    @Override
    public void land() {
        System.out.println("Landing permission granted.");
        mediator.setLandingStatus(true);
    }
}
