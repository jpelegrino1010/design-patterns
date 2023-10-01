package com.example.designpatterns.composite.ex2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SongService {

    private SongInfo songInfo;


    public void getSongList() {
        songInfo.displayInfo();
    }

}
