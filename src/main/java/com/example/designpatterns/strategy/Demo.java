package com.example.designpatterns.strategy;

public class Demo {

    public static void main(String[] args) {

        PaymentService service=new PaymentService();
        service.setStrategy(new PaymentByPaypal());
        service.setCost(100);
        service.processOrder();

        System.out.println("\n --------------------------------------\n");


        service.setStrategy(new PaymentByCreditCard());
        service.setCost(200);
        service.processOrder();

    }
}
