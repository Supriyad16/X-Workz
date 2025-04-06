package com.xworkz.fest.work;

class Travel extends Lift {
    Travel() {
        super();
        System.out.println("Travel class");
    }

    @Override
    public void moveUp() {
        System.out.println("Lift moves up while travelling.");
    }

    @Override
    public void moveDown() {
        System.out.println("Lift moves down while travelling.");
    }

    @Override
    public void stop() {
        System.out.println("Lift stops.");
    }

    @Override
    public void carryPeople() {
        System.out.println("Lift carries people.");
    }

    @Override
    public void indicateDirection() {
        System.out.println("Lift shows the direction.");
    }
}