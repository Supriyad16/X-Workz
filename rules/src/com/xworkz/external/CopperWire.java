package com.xworkz.external;

import com.xworkz.rules.Wire;

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

    @Override
    public void tie(){
        System.out.println("copper is good conductor of electricity");
    }

    public static void main(String[] args) {
        CopperWire copperWire = new CopperWire();
        copperWire.connect();
        copperWire.transmit();
        copperWire.insulate();
        copperWire.tie();
    }
}
