package com.example.designpatterns.templateMethod;

public class Demo {

    public static void main(String[] args) {
        BaseGameLoader loader=new DiabloLoader();
        loader.load();

        System.out.println("-------------------------\n");

        BaseGameLoader loader1= new WorldOfWarcraftLoader(15);
        loader1.load();
    }
}
