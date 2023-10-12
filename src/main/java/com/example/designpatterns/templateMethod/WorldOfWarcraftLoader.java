package com.example.designpatterns.templateMethod;

public class WorldOfWarcraftLoader extends BaseGameLoader{

    private byte gameData [];
    private int amountData;

    public WorldOfWarcraftLoader(int amountData) {
        this.amountData=amountData;
        gameData=new byte[amountData];

    }

    public WorldOfWarcraftLoader() {}

    @Override
    public byte[] loadLocalData() {
        System.out.println("Loading WC objects");
        return new byte[amountData];
    }

    @Override
    public void createObject(byte[] data) {
        for (byte i=1;i<data.length;i++) {
            data[i]=i;
        }
        gameData=data;
        System.out.println("creating WC object");
    }

    @Override
    public void downloadAdditionalFiles() {
        System.out.println("Downloading WC object");
        for (byte i=0;i<gameData.length;i++) {
            System.out.println(gameData[i]);
        }
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Initializing WC profiles");
    }
}
