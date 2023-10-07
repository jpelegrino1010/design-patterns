package com.example.designpatterns.chainofresponsability.ex2;

public class AddNumbers implements Chain{

    private Chain chain;

    @Override
    public void nextChain(Chain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getOperator()=='+') {
            System.out.println(request.getNumber1() +" + "+ request.getNumber2()
            + " = "+ (request.getNumber1() + request.getNumber2()) );
        }else {
            chain.calculate(request);
        }
    }
}
