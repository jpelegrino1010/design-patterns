package com.example.designpatterns.composite.ex2;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class SongGroup extends SongInfo{

    private List<SongInfo> children=new ArrayList<>();

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;

    }

    private String groupName;
    private String groupDescription;

    @Override
    public void displayInfo() {
        System.out.println(groupName+" "+ groupDescription);

        children.stream().forEach(songInfo -> songInfo.displayInfo());

    }

    @Override
    public void add(SongInfo songInfo) {
        children.add(songInfo);
    }
}
