package com.xworkz.fest.work;

public class TransportRunner {
    public static void main(String[] args) {

        Transport transport = new Bus();
        transport.move();
        transport.stop();
        transport.fuel();
        transport.capacity();
        transport.route();


        Bus bus = new Bus();
        bus.collectFare();
        bus.fixedStops();
        bus.driverAndConductor();
        bus.publicTransport();
        bus.luggageSpace();
    }
}
