package com.example.designpatterns.chainofresponsability.ex2;

public class ChainService {

    public Chain getChain(){

        Chain chainCalc1=new AddNumbers();
        Chain chainCalc2=new SubstractNumbers();
        Chain chainCalc3=new MultiplyNumbers();
        Chain chainCalc4=new DivideNumbers();
        Chain chainCalc5=new PowNumbers();

        chainCalc1.nextChain(chainCalc2);
        chainCalc2.nextChain(chainCalc3);
        chainCalc3.nextChain(chainCalc5);
        chainCalc5.nextChain(chainCalc4);

        return chainCalc1;
    }
}
