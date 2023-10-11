package com.example.designpatterns.momento;

public class Demo {
    public static void main(String[] args) {
        Editor editor=new Editor();
        editor.write("Juan");
        editor.write("Pedro");
        editor.write("Santiago");
        editor.undo();

        System.out.println(editor.getTextArea().getText());
    }
}
