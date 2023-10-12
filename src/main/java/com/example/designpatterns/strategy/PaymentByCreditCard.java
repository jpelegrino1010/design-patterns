package com.example.designpatterns.strategy;

public class PaymentByCreditCard implements PaymentStrategy {
    private CreditCard creditCard;

    @Override
    public void collectPaymentDetails() {
        System.out.println("Collecting information");
        creditCard=new CreditCard("89563214","6/2024","cvv");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating information");
        return false;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying "+ amount+
                " using Credit Card");
        creditCard.setAmount(creditCard.getAmount()-amount);
    }
}
