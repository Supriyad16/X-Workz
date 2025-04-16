package com.xworkz.rules;

public class PlasticChair implements Chair {

    @Override
    public void sit() {
        System.out.println("Sitting on the plastic chair");
    }

    @Override
    public void fold() {
        System.out.println("Folding the plastic chair");
    }

    @Override
    public void move() {
        System.out.println("Moving the plastic chair");
    }

    public static void main(String[] args) {
        PlasticChair chair = new PlasticChair();
        chair.sit();
        chair.fold();
        chair.move();
    }
}
