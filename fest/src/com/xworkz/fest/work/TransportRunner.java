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
        bus.move();
        bus.stop();
        bus.fuel();
        bus.capacity();
        bus.route();
    }
}
