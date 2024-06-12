package org.example.designpatterns.behavioural.memento;

public class Client {


    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("hi");
        editor.write("hi this");
        editor.write("hi this is ");
        editor.write("hi this is karuna");
        editor.undo();
        editor.undo();
        System.out.println(editor.textArea);
    }
}
