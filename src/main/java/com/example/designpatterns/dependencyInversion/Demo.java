package com.example.designpatterns.dependencyInversion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {

    public static void main(String[] args) throws IOException {
        MessagePrinter messagePrinter=new MessagePrinter();
        try(PrintWriter writer=new PrintWriter(new FileWriter("file.txt"))) {
            messagePrinter.writeMsg(new Message("Hello everyone Again"),writer);
        }
    }
}
