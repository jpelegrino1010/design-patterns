package com.example.designpatterns.bridge;

public class Demo {

    public static void main(String[] args) {
        AmericanRestaurant americanRestaurant=new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("\n \n");
        System.out.println("**********************************************");
        ItalianRestaurant italianRestaurant=new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
    }
}
