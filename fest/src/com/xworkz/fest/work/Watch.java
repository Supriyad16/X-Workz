package com.xworkz.fest.work;

public class Watch extends Time {

    Watch() {
        super();
        System.out.println("Future Time Machine activated");
    }

    @Override
    public void travelToPast() {
        System.out.println("Travel to past.");
    }

    @Override
    public void travelToFuture() {
        System.out.println("Travel to future");
    }

    @Override
    public void createTimeParadox() {
        System.out.println("A time paradox");
    }

    @Override
    public void countDown() {
        System.out.println("Countdown starts now.");
    }

    @Override
    public void seconds() {
        System.out.println("Time have seconds, minutes and hours.");
    }
}
