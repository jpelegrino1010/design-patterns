package com.example.designpatterns.proxy;

public class RealInternet implements Internet{
    @Override
    public void connect(String host) {
        System.out.println("Open connection to:: "+ host);
    }
}
