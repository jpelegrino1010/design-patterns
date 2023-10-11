package com.example.designpatterns.momento;

import lombok.Getter;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {

    private Deque<TextArea.Momento> stateHistory;
    @Getter
    private TextArea textArea;

    public Editor() {
        stateHistory=new LinkedList<>();
        textArea=new TextArea();
    }

    public void write(String text) {
        textArea.set(text);
        stateHistory.add(textArea.takeSnapshoot());
    }

    public void undo() {
        textArea.restore(stateHistory.pop());
    }
}
