package com.xworkz.rules;

public class Meal implements Fork, Frame {

    @Override
    public void lift() {
        System.out.println("Eating food with the fork");
    }

    @Override
    public void poke() {
        System.out.println("Stabbing food with the fork");
    }

    @Override
    public void wash() {
        System.out.println("Cleaning the fork");
    }

    @Override
    public void hang() {
        System.out.println("Hanging the frame on the wall");
    }

    @Override
    public void support() {
        System.out.println("Supporting the picture with the frame");
    }

    @Override
    public void display() {
        System.out.println("Decorating the room with the frame");
    }

    public static void main(String[] args) {
        Fork fork = new Meal();
        fork.lift();
        fork.poke();
        fork.wash();

        Frame frame = new Meal();
        frame.hang();
        frame.support();
        frame.display();
    }
}
