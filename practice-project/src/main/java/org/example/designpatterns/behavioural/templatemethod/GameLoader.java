package org.example.designpatterns.behavioural.templatemethod;

public abstract class GameLoader {


    void laod()
    {
        step1();
        step2();
        step3();
    }

    private void step3()
    {
        System.out.println("in GameLoader Step 3");
    }

    abstract public void step2();
    abstract public void step1();
}
