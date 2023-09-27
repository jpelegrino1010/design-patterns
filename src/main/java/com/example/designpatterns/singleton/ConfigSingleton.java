package com.example.designpatterns.singleton;

public class ConfigSingleton {

    private ConfigSingleton() {}
    private static final ConfigurationSin INSTANCE=new ConfigurationSin();

    public static ConfigurationSin getInstance() {
        return INSTANCE;
    }



}
