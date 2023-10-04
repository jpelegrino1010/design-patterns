package com.example.designpatterns.proxy.ex2;

public class RealVideoDownloader implements VideoDownloader{
    @Override
    public Video getVideo(String videoName) {
        System.out.println("Connecting to http://youtube.com");
        System.out.println("Downloading video");
        System.out.println("Retrieving video metadata");
        return new Video(videoName);
    }
}
