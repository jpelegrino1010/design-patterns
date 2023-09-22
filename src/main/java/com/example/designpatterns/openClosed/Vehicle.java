package com.example.designpatterns.openClosed;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public abstract class Vehicle {

    protected String name;
    protected String brand;

    public abstract void displayVehicleInfo();

}
