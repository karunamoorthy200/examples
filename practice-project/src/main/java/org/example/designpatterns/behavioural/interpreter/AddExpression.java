package org.example.designpatterns.behavioural.interpreter;

public class AddExpression implements Expression{
    public String expression;
    public AddExpression(String expression) {
        this.expression = expression;
    }
    @Override
    public int intepret(InterpreterEngine engine) {
        return engine.add(Integer.parseInt(expression.split(",")[0]),
                Integer.parseInt(expression.split(",")[1]));
    }
}
