package org.example.designpatterns.behavioural.mediator;


import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {

    List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String msg, User user) {

        for(User u : users)
        {
            if(u!=user)
            {
                u.recieveMessage(msg);
            }

        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
