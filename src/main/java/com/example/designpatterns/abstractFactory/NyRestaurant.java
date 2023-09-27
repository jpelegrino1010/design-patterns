package com.example.designpatterns.abstractFactory;

public class NyRestaurant implements Restaurant{
    @Override
    public void takeOrder() {
        System.out.println("New Your taking order");
    }
}
