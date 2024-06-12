package org.example.designpatterns.behavioural.command;

public class TextFile {
    private String name;
    public TextFile(String name) {
        this.name = name;
    }
    public void save()
    {
        System.out.println("file name : "+name+" will be saved");
    }
    public void open()
    {
        System.out.println("file name : "+name+" will be open");
    }

}
