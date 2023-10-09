package com.example.designpatterns.command;

public class Demo {
    public static void main(String[] args) {
        Kitchen kitchen=new Kitchen();
        kitchen.setCommand(new SwitchLightsCommand(new Light()));

        kitchen.executeCommand();
        kitchen.executeCommand();

    }
}
