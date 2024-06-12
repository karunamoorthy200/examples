package org.example.designpatterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {
    List<Command> commands = new ArrayList<>();
    public void executeCommand(Command command) {
        commands.add(command);
        command.execute();
    }
}
