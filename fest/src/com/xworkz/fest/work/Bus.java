package com.xworkz.fest.work;

public class Bus extends Transport {

    Bus() {
        super();
        System.out.println("Bus class");
    }

    public void collectFare() {
        System.out.println("Bus collects fare from passengers");
    }

    public void fixedStops() {
        System.out.println("Bus has fixed stops");
    }

    public void driverAndConductor() {
        System.out.println("Bus has a driver and conductor");
    }

    public void publicTransport() {
        System.out.println("Bus is a public transport vehicle");
    }

    public void luggageSpace() {
        System.out.println("Bus has luggage storage space");
    }
}
