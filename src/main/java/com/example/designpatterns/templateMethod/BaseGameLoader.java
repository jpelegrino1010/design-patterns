package com.example.designpatterns.templateMethod;

public abstract class BaseGameLoader {

    public void load() {
        byte data []=loadLocalData();
        createObject(data);
        downloadAdditionalFiles();
        cleanTempFiles();
        initializeProfiles();
    }

    public abstract byte [] loadLocalData();
    public abstract void createObject(byte [] data);
    public abstract void downloadAdditionalFiles();
    public abstract void initializeProfiles();

    protected void cleanTempFiles() {
        System.out.println("Cleaning temporary files");
    }
}
