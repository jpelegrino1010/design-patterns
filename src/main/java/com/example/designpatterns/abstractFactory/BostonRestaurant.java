package com.example.designpatterns.abstractFactory;

public class BostonRestaurant implements Restaurant{
    @Override
    public void takeOrder() {
        System.out.println("Boston Restaurant taking order");
    }
}
