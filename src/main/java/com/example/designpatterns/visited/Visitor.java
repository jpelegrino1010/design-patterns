package com.example.designpatterns.visited;

import java.util.List;

public interface Visitor {
    void visit(Bank bank);
    void visit(Restaurant restaurant);
    void visit(Resident resident);
    void sendInsuranceMails(List<Client> clients);
}
