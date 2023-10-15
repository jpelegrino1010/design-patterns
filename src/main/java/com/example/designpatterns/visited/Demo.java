package com.example.designpatterns.visited;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Visitor visitor=new InsuranceMessagingVisitor();

        List<Client> clients= Arrays.asList(new Bank("","","",3));

        visitor.sendInsuranceMails(clients);

    }
}
