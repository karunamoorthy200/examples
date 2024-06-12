package org.example.designpatterns.behavioural.state;

public class OnState extends State{

    @Override
    public void doAction() {
        super.context.onState();

    }
}
