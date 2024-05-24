package org.example.designpatterns.structural.decorator;

public class Client {


    public static void main(String[] args) {
        INotifier Notifier1 = new SmsDecorator(new WhatsappDecorator(new Notifier("Karuna")));
        Notifier1.send("your order is placed");
    }
}
