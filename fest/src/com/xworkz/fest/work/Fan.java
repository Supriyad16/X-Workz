package com.xworkz.fest.work;

class Fan extends Air {
    Fan() {
        super();
        System.out.println("Fan class");
    }

    public void rotateBlades() {
        System.out.println("Fan rotates its blades to move air.");
    }

    public void increaseSpeed() {
        System.out.println("Fan speed can be increased.");
    }

    public void decreaseSpeed() {
        System.out.println("Fan speed can be decreased.");
    }

    public void consumeElectricity() {
        System.out.println("Fan consumes electricity to operate.");
    }

    public void coolTheRoom() {
        System.out.println("Fan helps cool the room.");
    }
}
