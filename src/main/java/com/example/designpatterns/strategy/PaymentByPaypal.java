package com.example.designpatterns.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PaymentByPaypal implements PaymentStrategy{

    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        setEmail("jmartinez@gmail.com");
        setPassword("12345");
    }

    @Override
    public boolean validatePaymentDetails() {
        return this.getEmail().equals("jmartinez@gmail.com") &&
                 this.getPassword().equals("12345");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying "+ amount + " using paypal");
    }
}
