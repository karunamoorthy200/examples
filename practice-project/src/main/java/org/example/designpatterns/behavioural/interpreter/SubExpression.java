package org.example.designpatterns.behavioural.interpreter;

public class SubExpression implements Expression{
    public String expression;
    public SubExpression(String expression) {
        this.expression = expression;
    }
    @Override
    public int intepret(InterpreterEngine engine) {
        return engine.sub(Integer.parseInt(expression.split(",")[0]),
                Integer.parseInt(expression.split(",")[1]));
    }
}
