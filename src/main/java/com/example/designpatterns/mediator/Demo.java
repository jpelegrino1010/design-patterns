package com.example.designpatterns.mediator;

public class Demo {
    public static void main(String[] args) {
        IATCMediator mediator=new ATCMediator();

        Flight sparrow101=new Flight(mediator);
        Runaway mainRunaway=new Runaway(mediator);

        mediator.registerFlight(sparrow101);
        mediator.registerRunaway(mainRunaway);

        sparrow101.getReady();
//        mainRunaway.land();
        sparrow101.land();
    }
}
