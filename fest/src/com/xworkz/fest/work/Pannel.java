package com.xworkz.fest.work;

public class Pannel extends Projector {
    Pannel() {
        super();
        System.out.println("Panel is initializing");
    }

    @Override
    public void powerOn() {
        System.out.println("Projector is on");
    }

    @Override
    public void powerOff() {
        System.out.println("Projector is off");
    }

    @Override
    public void focus() {
        System.out.println("Adjusting projector focus by using pannel.");
    }

    @Override
    public void brightness() {
        System.out.println("Change brightness level");
    }

    @Override
    public void displayResolution() {
        System.out.println("Display resolution settings");
    }

}