package com.example.designpatterns.templateMethod;

public class DiabloLoader extends BaseGameLoader{
    @Override
    public byte[] loadLocalData() {
        System.out.println("Loading Diablo objects");
        return new byte[0];
    }

    @Override
    public void createObject(byte[] data) {
        System.out.println("creating Diablo object");
    }

    @Override
    public void downloadAdditionalFiles() {
        System.out.println("Downloading Diablo object");
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Initializing Diablo profiles");
    }
}
