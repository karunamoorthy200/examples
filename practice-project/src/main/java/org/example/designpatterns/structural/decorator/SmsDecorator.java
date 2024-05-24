package org.example.designpatterns.structural.decorator;

public class SmsDecorator extends BaseDecorator{
    public SmsDecorator(INotifier wrapped) {
        super(wrapped);
    }


    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("for the user : "+getUserName()+" we are sending the message by sms  : "+msg);
    }

    @Override
    public String getUserName() {
        return super.getUserName();
    }
}
