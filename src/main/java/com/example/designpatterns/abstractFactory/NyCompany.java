package com.example.designpatterns.abstractFactory;

public class NyCompany extends Company{
    @Override
    public Restaurant createRestaurant() {
        return new NyRestaurant();
    }

    @Override
    public Store createStore() {
        return new NyStore();
    }
}
