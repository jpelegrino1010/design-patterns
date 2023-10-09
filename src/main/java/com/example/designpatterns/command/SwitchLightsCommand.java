package com.example.designpatterns.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SwitchLightsCommand implements Command{
    private Light light;

    @Override
    public void execute() {
        if (light.switchLights()) {
            System.out.println("Turning on the light");
        }else {
            System.out.println("Turning off the light");
        }
    }
}
