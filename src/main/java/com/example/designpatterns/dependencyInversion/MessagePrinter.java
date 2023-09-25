package com.example.designpatterns.dependencyInversion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

    public void writeMsg(Message message,PrintWriter writer) {
            writer.write(message.getMsg());
    }
}
