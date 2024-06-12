package org.example.designpatterns.behavioural.command;

public class OpenCommand implements Command{
    TextFile file;
    public OpenCommand(TextFile file) {
        this.file = file;
    }
    @Override
    public void execute() {
        file.open();
    }
}
