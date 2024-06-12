package org.example.designpatterns.behavioural.interpreter;

public class Factory {
    private final InterpreterEngine interpreterEngine;
    public Factory(InterpreterEngine interpreterEngine) {
        this.interpreterEngine = interpreterEngine;
    }
    public int createExpression(String expression)
    {
        Expression expression1;
        if (expression.toLowerCase().contains("add"))
            expression1 = new AddExpression(expression.split(":")[1]);
        else
            expression1 = new SubExpression(expression.split(":")[1]);

        return expression1.intepret(interpreterEngine);
    }


}
