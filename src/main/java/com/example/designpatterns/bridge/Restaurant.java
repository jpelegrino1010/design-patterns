package com.example.designpatterns.bridge;

import lombok.Getter;
import lombok.Setter;

/*
Abstract abstraction
 */
public abstract class Restaurant {
    @Getter @Setter
    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSource();
    abstract void addToppings();
    abstract void makeCrust();

    public void deliver() {
        makeCrust();
        addSource();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in progress");
    }



}
