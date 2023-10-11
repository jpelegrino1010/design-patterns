package com.example.designpatterns.observer;

import lombok.Getter;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        notificationService=new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyListener();
    }

    public NotificationService getService() {
        return notificationService;
    }


}
