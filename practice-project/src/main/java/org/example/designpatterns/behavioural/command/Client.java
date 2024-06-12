package org.example.designpatterns.behavioural.command;

public class Client {


    public static void main(String[] args) {
        TextFile file = new TextFile("karunaFile");
        Command openCommand = new OpenCommand(file);
        Command saveCommand = new SaveCommand(file);
        CommandExecutor executor = new CommandExecutor();
        executor.executeCommand(openCommand);
        executor.executeCommand(saveCommand);
    }
}
