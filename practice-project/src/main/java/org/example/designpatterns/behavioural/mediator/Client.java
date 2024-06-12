package org.example.designpatterns.behavioural.mediator;

public class Client {


    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();


        User user1 = new User(mediator,"karuna");
        User user2 = new User(mediator, "therasa");
        User user3 = new User(mediator, "kerena");
        User user4 = new User(mediator, "raji");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user1.sendMessage("hi this is "+user1.name);
    }
}
