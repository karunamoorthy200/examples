package org.example.designpatterns.dynamicproxy;

public class RealObject implements RealInterface{
    private int value = 5;
    @Override
    public void print(String message)
    {
        System.out.println("Message = "+message +value);
    }
}
