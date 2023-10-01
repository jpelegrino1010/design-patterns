package com.example.designpatterns.composite.ex2;

public abstract class SongInfo {
    public abstract void displayInfo();
    public void add(SongInfo songInfo) {
        throw new UnsupportedOperationException();
    }
}
