package org.example.designpatterns.structural.decorator;

public abstract class BaseDecorator implements INotifier{

    private INotifier wrapped;


    public BaseDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void send(String msg) {
        wrapped.send(msg);
    }

    @Override
    public String getUserName() {
        return wrapped.getUserName();
    }
}
