package com.example.designpatterns.abstractFactory;

public class BostonCompany extends Company{
    @Override
    public Restaurant createRestaurant() {
        return new BostonRestaurant();
    }

    @Override
    public Store createStore() {
        return new BostonStore();
    }
}
