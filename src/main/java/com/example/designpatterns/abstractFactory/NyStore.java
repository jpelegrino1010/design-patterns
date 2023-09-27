package com.example.designpatterns.abstractFactory;

public class NyStore implements Store{
    @Override
    public void pickItem() {
        System.out.println("New York Store");
    }
}
