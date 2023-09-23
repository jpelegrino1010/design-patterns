package com.example.designpatterns.liskovsub;

public class Associate extends ClassRoomResponsable implements Teacher{

    @Override
    public void teach() {
        System.out.println("Teaching");
    }
}
