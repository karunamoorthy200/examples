package org.example.designpatterns.behavioural.mediator;

import java.util.List;

public interface Mediator {



    void sendMessage(String msg, User user);


    void addUser(User user);

}
