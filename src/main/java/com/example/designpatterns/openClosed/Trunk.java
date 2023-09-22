package com.example.designpatterns.openClosed;

public class Trunk extends Vehicle{
    @Override
    public void displayVehicleInfo() {
        System.out.println("Trunck information");
        System.out.println(this.toString());
    }
}
