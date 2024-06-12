package org.example.designpatterns.behavioural.strategy;

public class Client {

    public static void main(String[] args) {
        Context context = new Context(new PaymentByCreditCard());
        context.makePayment();
    }

}
