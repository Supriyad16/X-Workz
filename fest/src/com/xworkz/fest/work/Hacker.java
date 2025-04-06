package com.xworkz.fest.work;

public class Hacker extends Spy {

    Hacker() {
        super();
        System.out.println("Hacker activated: Ready for the cyber mission!");
    }

    @Override
    public void gatherIntel() {
        System.out.println("Gathering intel from digital sources and networks.");
    }

    @Override
    public void disguise() {
        System.out.println("Using digital and physical disguises to stay undercover.");
    }

    @Override
    public void useGadgets() {
        System.out.println("Using advanced tech gadgets for hacking and surveillance.");
    }

    @Override
    public void escape() {
        System.out.println("Executing escape plan to avoid detection.");
    }

    @Override
    public void decodeMessage() {
        System.out.println("Decoding encrypted messages and data.");
    }
}
