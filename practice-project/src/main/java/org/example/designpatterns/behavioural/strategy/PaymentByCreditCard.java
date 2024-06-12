package org.example.designpatterns.behavioural.strategy;

public class PaymentByCreditCard implements PaymentStrategy{
    @Override
    public void doPayemnt() {
        System.out.println("the payment done by the credit card");
    }
}
