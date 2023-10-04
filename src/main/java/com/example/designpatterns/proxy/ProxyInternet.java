package com.example.designpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private final static Internet internet=new RealInternet();
    private final static List<String> bannedSites=new ArrayList<>();

    //Database simulation
    static {
        bannedSites.add("banned.com");
    }

    @Override
    public void connect(String host) {
        if (bannedSites.contains(host)) {
            System.out.println("Access Denied");
            return;
        }

        internet.connect(host);
    }
}
