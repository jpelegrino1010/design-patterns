package com.example.designpatterns.openClosed;

public class Car extends Vehicle{

    @Override
    public void displayVehicleInfo() {
        System.out.println("Car information");
        System.out.println(this.toString());
    }
}
