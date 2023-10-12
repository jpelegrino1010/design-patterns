package com.example.designpatterns.strategy;

import lombok.Data;

@Data
public class CreditCard {
    private double amount=1_000;
    private final String number;
    private final String date;
    private final String cvv;

}
