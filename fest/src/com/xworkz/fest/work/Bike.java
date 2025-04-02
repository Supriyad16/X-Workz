package com.xworkz.fest.work;

public class Bike extends TwoWheeler {

    Bike() {
        super();
        System.out.println("Bike class");
    }

    public void twoWheels() {
        System.out.println("Bike has two wheels");
    }

    public void handlebar() {
        System.out.println("Bike has a handlebar for steering");
    }

    public void kickStart() {
        System.out.println("Bike can be started with a kick");
    }

    public void fuelEfficiency() {
        System.out.println("Bike has good fuel efficiency");
    }

    public void lightweight() {
        System.out.println("Bike is lightweight");
    }
}
