package org.example.designpatterns.behavioural.state;

public abstract class  State {
    public Context context;

    public void setContext(Context context) {
        this.context = context;
    }
    abstract void doAction();
}
