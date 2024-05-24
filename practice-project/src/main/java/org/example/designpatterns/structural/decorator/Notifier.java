package org.example.designpatterns.structural.decorator;

public class Notifier implements INotifier{

    private String userName;

    public Notifier(String userName) {
        this.userName = userName;
    }

    @Override
    public void send(String msg) {
        System.out.println("for the user : "+userName +" sending msg by mail: "+msg);

    }

    @Override
    public String getUserName() {
        return this.userName;
    }
}
