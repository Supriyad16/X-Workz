package com.xworkz.external;

import com.xworkz.rules.Chair;

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

    @Override
    public void relax(){
        System.out.println("relax on plastic chair");
    }

    public static void main(String[] args) {
        PlasticChair plasticChair = new PlasticChair();
        plasticChair.sit();
        plasticChair.fold();
        plasticChair.move();
        plasticChair.relax();
    }
}
