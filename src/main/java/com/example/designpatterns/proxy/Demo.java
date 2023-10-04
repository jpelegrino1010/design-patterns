package com.example.designpatterns.proxy;

public class Demo {

    public static void main(String[] args) {
        Internet internet=new ProxyInternet();
        internet.connect("google.com");
        internet.connect("banned.com");
    }
}
