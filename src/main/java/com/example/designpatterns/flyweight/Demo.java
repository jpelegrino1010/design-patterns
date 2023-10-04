package com.example.designpatterns.flyweight;

import java.util.Random;

public class Demo {
    private final static int BOOK_TYPES=2;
    private final static int BOOKS_TO_INSERT=10_100_000;
    public static void main(String[] args) {
        Store store=new Store();
        for (int i= 0;i<10;i++) {
            store.storeBook(getRandomName(),getRandomPrice(),"Action","Follet","Stuff");
            store.storeBook(getRandomName(),getRandomPrice(),"Action","Follet","Stuff");
        }

        store.displayBooks();
    }

    public static String getRandomName() {
        Random random=new Random();
        int next= random.nextInt(100);
        return "Name "+ next;
    }

    public static double getRandomPrice() {
        Random random=new Random();
        double next= random.nextDouble(100);
        return next;
    }


}
