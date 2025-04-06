package com.xworkz.fest.work;

public class Ticket extends Train {

    Ticket() {
        super();
        System.out.println("Ticket is issued");
    }

    @Override
    public void start() {
        System.out.println("Train get starts.");
    }

    @Override
    public void stop() {
        System.out.println("Train has been stopped.");
    }

    @Override
    public void speedUp() {
        System.out.println("Train is speeding up now.");
    }

    @Override
    public void slowDown() {
        System.out.println("Train slows down.");
    }

    @Override
    public void announce() {
        System.out.println("Train makes an announcement.");
    }

}
