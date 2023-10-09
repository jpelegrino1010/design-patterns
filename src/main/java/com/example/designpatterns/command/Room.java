package com.example.designpatterns.command;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Room {
    private Command command;

    public void executeCommand() {
        command.execute();
    }

}
