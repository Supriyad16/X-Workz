package com.xworkz.fest.work;

public class SpyRunner {
    public static void main(String[] args) {

        Spy spy = new Hacker();
        spy.gatherIntel();
        spy.disguise();
        spy.useGadgets();
        spy.escape();
        spy.decodeMessage();



        Hacker hacker = new Hacker();
        hacker.hackSecurity();
        hacker.stealData();
        hacker.writeVirus();
        hacker.eraseEvidence();
        hacker.takeControl();
    }
}
