package org.example.designpatterns.behavioural.command;

public class SaveCommand implements Command{
    TextFile file;

    public SaveCommand(TextFile file) {
        this.file = file;
    }
    @Override
    public void execute() {
        file.save();
    }
}
