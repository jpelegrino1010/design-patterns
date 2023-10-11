package com.example.designpatterns.momento.ex2;

public class Demo {
    public static void main(String[] args) {

        MementoService mementoService=new MementoService();
        mementoService.add("1000 B.C");
        mementoService.add("1000 A.D");
        mementoService.add("200 A.D");
        mementoService.add("4000 A.D");

        mementoService.undo();
    }
}
