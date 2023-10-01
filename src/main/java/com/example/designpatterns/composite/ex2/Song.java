package com.example.designpatterns.composite.ex2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Song extends SongInfo{

    private String songName;
    private String bandName;
    private int yearReleased;

    @Override
    public void displayInfo() {
        System.out.println("************************************ \n"+
                songName +" "+ bandName+ " released at "+ yearReleased);
    }


}
