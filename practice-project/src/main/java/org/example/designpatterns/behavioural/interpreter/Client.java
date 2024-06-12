package org.example.designpatterns.behavioural.interpreter;

public class Client {


    public static void main(String[] args) {
        InterpreterEngine interpreterEngine = new InterpreterEngine();
        Factory factory= new Factory(interpreterEngine);
        System.out.println(factory.createExpression("add:100,20"));
        System.out.println(factory.createExpression("sub:100,20"));
    }
}
