package com.example.designpatterns.strategy;

import lombok.Setter;

@Setter
public class PaymentService {

    private PaymentStrategy strategy;
    private double cost;
    private boolean includeDelivery;

    public void processOrder() {
        strategy.collectPaymentDetails();
        if(strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }else {
            System.out.println("We having issue to process your order");
        }
    }

    private double getTotal() {
        return includeDelivery ? cost +10 : cost;
    }
}
