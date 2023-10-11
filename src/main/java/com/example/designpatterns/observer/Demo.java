package com.example.designpatterns.observer;

public class Demo {
    public static void main(String[] args) {
        Store store=new Store();

        store.getService().subscribe(new EmailMsgListener("jmartinez@gmail.com"));

        store.getService().subscribe(new EmailMsgListener("pgonzalez@gmail.com"));

        store.getService().subscribe(new EmailMsgListener("vherrera@gmail.com"));

        store.getService().unsubscribe(new EmailMsgListener("pgonzalez@gmail.com"));

        store.newItemPromotion();

    }
}
