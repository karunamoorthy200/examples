package org.example.designpatterns.behavioural.memento;

import java.util.Deque;
import java.util.Stack;

public class Editor {
    public TextArea textArea;
    public Stack<TextArea.Memento> history;
    public Editor() {
        this.textArea = new TextArea();
        this.history = new Stack<>();
    }
    public void write(String text)
    {
        textArea.set(text);
        history.push(textArea.takeSnapShot());
    }
    public void undo()
    {
        textArea.restore(history.pop());
    }
}
