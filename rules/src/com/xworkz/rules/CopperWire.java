package com.xworkz.rules;

public class CopperWire implements Wire {

    @Override
    public void connect() {
        System.out.println("Connecting devices with copper wire");
    }

    @Override
    public void transmit() {
        System.out.println("Transmitting electricity through copper wire");
    }

    @Override
    public void insulate() {
        System.out.println("Insulating the copper wire");
    }

    public static void main(String[] args) {
        CopperWire wire = new CopperWire();
        wire.connect();
        wire.transmit();
        wire.insulate();
    }
}
