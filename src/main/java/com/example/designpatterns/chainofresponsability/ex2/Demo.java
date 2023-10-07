package com.example.designpatterns.chainofresponsability.ex2;

public class Demo {
    public static void main(String[] args) {

        ChainService service=new ChainService();

        Chain chain=service.getChain();

        Numbers request=new Numbers(4,2,'/');
        chain.calculate(request);
    }
}
