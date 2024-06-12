package org.example.designpatterns.behavioural.templatemethod;

public class ContraLoader extends GameLoader{
    @Override
    public void step2() {
        System.out.println("Step 2 from the ContraLoader");
    }

    @Override
    public void step1() {
        System.out.println("Step 1 from the ContraLoader");
    }
}
