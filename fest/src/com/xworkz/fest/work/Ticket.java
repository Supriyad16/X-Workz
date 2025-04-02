package com.xworkz.fest.work;


public class Ticket extends Train {

    Ticket() {
        super();
        System.out.println("Ticket is issued");
    }
    public void bookTicket() {

        System.out.println("Ticket is booked");
    }
    public void cancelTicket() {

        System.out.println("Ticket is canceled");
    }
    public void checkAvailability() {

        System.out.println("Checking ticket availability");
    }
    public void printTicket() {

        System.out.println("Printing ticket");
    }
    public void getFareDetails() {

        System.out.println("Fetching ticket fare details");
    }
}
