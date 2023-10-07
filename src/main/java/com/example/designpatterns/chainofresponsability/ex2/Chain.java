package com.example.designpatterns.chainofresponsability.ex2;

public interface Chain {

    void nextChain(Chain nextChain);
    void calculate(Numbers request);
}
