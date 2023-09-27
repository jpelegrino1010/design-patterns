package com.example.designpatterns.abstractFactory;

public class BostonStore implements Store{
    @Override
    public void pickItem() {
        System.out.println("Boston Store");
    }
}
