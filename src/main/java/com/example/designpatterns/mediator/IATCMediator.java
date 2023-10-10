package com.example.designpatterns.mediator;
//Mediator
public interface IATCMediator {

    void registerRunaway(Runaway runaway);
    void registerFlight(Flight flight);
    boolean isLandingOk();
    void setLandingStatus(boolean status);
}
