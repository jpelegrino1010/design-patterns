package com.example.designpatterns.mediator;

public class ATCMediator implements IATCMediator{

    private Flight flight;
    private Runaway runaway;
    private boolean land;


    @Override
    public void registerRunaway(Runaway runaway) {
        this.runaway=runaway;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight=flight;
    }

    @Override
    public boolean isLandingOk() {
        return land;
    }

    @Override
    public void setLandingStatus(boolean status) {
        this.land=status;
    }
}
