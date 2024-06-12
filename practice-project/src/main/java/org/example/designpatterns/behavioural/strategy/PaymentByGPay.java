package org.example.designpatterns.behavioural.strategy;

public class PaymentByGPay implements PaymentStrategy{
    @Override
    public void doPayemnt() {
        System.out.println("the payement done by the GPay");
    }
}
