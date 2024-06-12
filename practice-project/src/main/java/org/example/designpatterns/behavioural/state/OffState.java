package org.example.designpatterns.behavioural.state;

public class OffState extends State{

    @Override
    public void doAction() {
        super.context.offState();
    }
}
