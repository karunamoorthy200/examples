package org.example.designpatterns.behavioural.mediator;

public class User {

    Mediator mediator;


    public String name;


    public User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void sendMessage(String message)
    {
        mediator.sendMessage(message, this);
    }



    public void recieveMessage(String message)
    {
        System.out.println("User : " +this.name+" recieves the message : "+message);
    }

}
