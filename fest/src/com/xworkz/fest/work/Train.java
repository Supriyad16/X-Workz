package com.xworkz.fest.work;

// Parent class Train
public class Train {
    Train() {
        System.out.println("Train is running");
    }
    public void start() {

        System.out.println("Train is starting");
    }
    public void stop() {

        System.out.println("Train has stopped");
    }
    public void speedUp() {

        System.out.println("Train is speeding up");
    }
    public void slowDown() {

        System.out.println("Train is slowing down");
    }
    public void announce() {

        System.out.println("Train is making an announcement");
    }
}

// Child class Ticket extending Train
