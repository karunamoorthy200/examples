package org.example.designpatterns.behavioural.memento;

public class TextArea {
    private String text;
    public void set(String text)
    {
        this.text = text;
    }
    public Memento takeSnapShot()
    {
        return new Memento(this.text);
    }
    public void restore(Memento memento)
    {
        this.text = memento.getText();
    }

    public class Memento{
        private final String text;
        public Memento(String text) {
            this.text = text;
        }
        public String getText() {
            return text;
        }
    }

}
