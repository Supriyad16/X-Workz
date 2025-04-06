package com.xworkz.fest.work;

public class TrainRunner {

    public static void main(String[] args) {

        Train train = new Train();
        train.announce();
        train.slowDown();
        train.speedUp();
        train.stop();
        train.start();

        Ticket ticket = new Ticket();
        ticket.announce();
        ticket.stop();
        ticket.slowDown();
        ticket.speedUp();
        ticket.start();

    }
}
