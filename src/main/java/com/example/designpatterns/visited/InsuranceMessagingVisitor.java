package com.example.designpatterns.visited;


import java.util.List;

public class InsuranceMessagingVisitor implements Visitor{

    @Override
    public void sendInsuranceMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("sending mail about theft insurance...");
    }

    @Override
    public void visit(Restaurant restaurant) {
        System.out.println("Sending mail about fire and food insurance...");
    }

    @Override
    public void visit(Resident resident) {
        System.out.println("Sending mail about medical insurance");
    }
}
