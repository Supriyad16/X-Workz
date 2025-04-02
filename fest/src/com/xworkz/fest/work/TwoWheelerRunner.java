package com.xworkz.fest.work;

public class TwoWheelerRunner {
    public static void main(String[] args) {

        TwoWheeler twoWheeler = new Bike();
        twoWheeler.start();
        twoWheeler.stop();
        twoWheeler.fuel();
        twoWheeler.horn();
        twoWheeler.accelerate();


        Bike bike = new Bike();
        bike.twoWheels();
        bike.handlebar();
        bike.kickStart();
        bike.fuelEfficiency();
        bike.lightweight();
    }
}
