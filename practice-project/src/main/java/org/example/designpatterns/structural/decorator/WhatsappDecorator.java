package org.example.designpatterns.structural.decorator;

public class WhatsappDecorator extends BaseDecorator{


    public WhatsappDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("for the user : "+getUserName()+" we are sending the message by whatsapp  : "+msg);
    }

    @Override
    public String getUserName() {
        return super.getUserName();
    }
}
