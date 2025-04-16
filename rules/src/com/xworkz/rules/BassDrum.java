package com.xworkz.rules;

public class BassDrum implements Drum {

    @Override
    public void beat() {
        System.out.println("Beating the bass drum");
    }

    @Override
    public void carry() {
        System.out.println("Carrying the bass drum");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the bass drum");
    }

    public static void main(String[] args) {
        BassDrum drum = new BassDrum();
        drum.beat();
        drum.carry();
        drum.tune();
    }
}
