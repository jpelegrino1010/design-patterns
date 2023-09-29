package com.example.designpatterns.bridge;

public class ItalianRestaurant extends Restaurant{

    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSource() {
        pizza.setSource("Oil");
    }

    @Override
    void addToppings() {
        pizza.setToppings(null);
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thin");
    }
}
