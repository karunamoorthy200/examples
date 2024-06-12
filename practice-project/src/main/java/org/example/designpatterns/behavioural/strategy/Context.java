package org.example.designpatterns.behavioural.strategy;

public class Context {
    PaymentStrategy strategy;
    public Context(PaymentStrategy strategy)
    {
        this.strategy = strategy;
    }
    public void makePayment()
    {
        System.out.println("MakePayment Start");
        strategy.doPayemnt();
        System.out.println("MakePayment End");
    }
}
