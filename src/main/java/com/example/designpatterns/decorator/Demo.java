package com.example.designpatterns.decorator;

public class Demo {

    public static void main(String[] args) {
        MainProduct product=new MainProduct();

        Article article=new Shirt(new Pant(new Belt(product)));

        System.out.println(article.getName() +" Total: "+ article.getPrice());
    }
}
