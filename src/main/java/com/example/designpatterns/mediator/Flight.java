package com.example.designpatterns.mediator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Flight implements Command{

    private IATCMediator mediator;


    @Override
    public void land() {
        if(mediator.isLandingOk()) {
            System.out.println("Successfully Landed.");
            mediator.setLandingStatus(true);
        }else {
            System.out.println("Waiting for landing.");
        }
    }

    public void getReady() {
        System.out.println("Ready for landing.");
    }
}
