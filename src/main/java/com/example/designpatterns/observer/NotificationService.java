package com.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private final List<EmailMsgListener> customers;

    public NotificationService() {
        customers=new ArrayList<>();
    }

    public void subscribe(EmailMsgListener listener) {
        customers.add(listener);
    }

    public void unsubscribe(EmailMsgListener listener) {
        customers.removeIf(listener1 -> listener1.getEmail().equals(listener.getEmail()));
    }

    public void notifyListener() {
        customers.stream().forEach(listener -> listener.update());
    }
}

