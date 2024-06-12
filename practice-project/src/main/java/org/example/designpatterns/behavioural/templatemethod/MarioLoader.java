package org.example.designpatterns.behavioural.templatemethod;

public class MarioLoader extends GameLoader{


    @Override
    public void step2() {
        System.out.println("Step 2 from the Mario Loader");

    }

    @Override
    public void step1() {
        System.out.println("Step 1 from the Mario Loader");
    }
}
