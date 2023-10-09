package com.example.designpatterns.command;

import lombok.Getter;

@Getter
public class Light {
    private boolean switchedOn;

    public boolean switchLights() {
        switchedOn= !switchedOn;
        return switchedOn;
    }
}
