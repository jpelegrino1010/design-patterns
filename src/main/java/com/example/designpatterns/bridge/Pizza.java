package com.example.designpatterns.bridge;

import lombok.Data;

/*
Implementation abstraction
 */
@Data
public abstract class Pizza {

    protected String source;
    protected String toppings;
    protected String crust;

    public abstract void assemble();
    public abstract void qualityCheck();
}
