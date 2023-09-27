package com.example.designpatterns.abstractFactory;

public class Demo {

    public static void main(String[] args) {
        Company nyCompany=new NyCompany();
        nyCompany.createRestaurant().takeOrder();
        nyCompany.createStore().pickItem();

        Company bostonCompany=new BostonCompany();
        bostonCompany.createRestaurant().takeOrder();
        bostonCompany.createStore().pickItem();
    }
}
