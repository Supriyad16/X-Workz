package com.xworkz.vacation.internal;

public class WashingMachine extends Appliance {

    WashingMachine() {
        super();
        System.out.println("Washing Machine class");
    }

    @Override
    public void turnOn() {
        System.out.println("WashingMachine is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("WashingMachine is turned off");
    }

    @Override
    public void consumePower() {
        System.out.println("WashingMachine consumes power");
    }

    @Override
    public void warranty() {
        System.out.println("WashingMachine has a warranty");
    }

    @Override
    public void maintenance() {
        System.out.println("WashingMachine requires maintenance");
    }

    public void clean() {
        System.out.println("WashingMachine cleans cloth");
    }

}
