package com.example.designpatterns.proxy.ex2;

public class Demo {
    public static void main(String[] args) {

        VideoDownloader videoDownloader=new ProxyVideoDownloader();
        videoDownloader.getVideo("video1");
        videoDownloader.getVideo("video1");
        videoDownloader.getVideo("video2");
        videoDownloader.getVideo("video3");
        videoDownloader.getVideo("video1");

    }
}
