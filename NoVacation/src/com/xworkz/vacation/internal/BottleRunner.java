package com.xworkz.vacation.internal;

public class BottleRunner {
    public static void main(String[] args) {

        Bottle bottle = new Steel();
        bottle.store();
        bottle.reusable();
        bottle.shapes();
        bottle.portable();
        bottle.materials();

        Steel steel = new Steel();
        steel.materials();
        steel.reusable();
        steel.shapes();
        steel.portable();
        steel.store();

        Copper copper = new Copper();
        copper.colour();
        copper.portable();
        copper.materials();
        copper.reusable();
        copper.shapes();
        copper.store();
    }
}