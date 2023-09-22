package com.example.designpatterns.openclose;

import com.example.designpatterns.openClosed.Car;
import com.example.designpatterns.openClosed.Trunk;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Demo {

    @Test
    public void vehicleTest() {
        Car car=new Car();
        car.setBrand("BMW");
        car.setName("Peter");

        car.displayVehicleInfo();

        Trunk trunk=new Trunk();
        trunk.setBrand("Mercedez");
        trunk.setName("Carlos");

        trunk.displayVehicleInfo();
    }
}
