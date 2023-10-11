package com.example.designpatterns.momento.ex2;

import java.util.ArrayList;
import java.util.List;

public class MementoService {
    private List<Life.Memento> saveTimes=new ArrayList<>();
    private Life life=new Life();

    public void add(String time) {
        life.set(time);
        saveTimes.add(life.saveToMemento());
    }

    public void undo() {
        life.restore(saveTimes.get(saveTimes.size()-1));
    }


}
