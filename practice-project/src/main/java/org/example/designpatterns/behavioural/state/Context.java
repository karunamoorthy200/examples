package org.example.designpatterns.behavioural.state;

public class Context {
    private State state;

    public Context(State state)
    {
        this.state = state;
    }
    void onState()
    {
        System.out.println("inside the on state");
    }

    void offState()
    {
        System.out.println("inside the off state");
    }


}
