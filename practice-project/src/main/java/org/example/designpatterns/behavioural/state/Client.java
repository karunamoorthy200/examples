package org.example.designpatterns.behavioural.state;

public class Client {

    public static void main(String[] args) {
        State onstate = new OnState();
        Context context = new Context(onstate);
        onstate.setContext(context);
        onstate.doAction();
        State offstate = new OffState();
        offstate.setContext(context);
        offstate.doAction();
    }
}
