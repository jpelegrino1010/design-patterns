package com.example.designpatterns.proxy.ex2;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader{

    private Map<String,Video> videos=new HashMap<>();
    private VideoDownloader videoDownloader=new RealVideoDownloader();

    @Override
    public Video getVideo(String videoName) {
        if (!videos.containsKey(videoName))
            videos.put(videoName,videoDownloader.getVideo(videoName));

        return videos.get(videoName);
    }
}
