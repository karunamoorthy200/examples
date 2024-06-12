package org.example.designpatterns.behavioural.chainofresponsibility;

public class LoginService {

    Handler handler;

    public LoginService( Handler handler)
    {
        this.handler = handler;
    }

    public boolean validateUser(String userName, String password){
        return handler.handle(userName, password);
    }


}
