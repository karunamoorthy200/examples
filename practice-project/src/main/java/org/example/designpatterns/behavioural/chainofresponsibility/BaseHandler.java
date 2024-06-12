package org.example.designpatterns.behavioural.chainofresponsibility;

public abstract class BaseHandler implements Handler{

    Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return this;
    }

    @Override
    public abstract boolean handle(String userName, String password);


    public boolean handleNext(String userName, String password)
    {
        if(next ==null)
            return false;
        return next.handle(userName, password);
    }


}
