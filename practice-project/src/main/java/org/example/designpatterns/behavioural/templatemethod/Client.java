package org.example.designpatterns.behavioural.templatemethod;

public class Client {


    public static void main(String[] args) {
        GameLoader mario = new MarioLoader();

        mario.laod();
    }
}
