package com.xworkz.fest.work;

public class Piano extends Instrument {

    Piano() {
        super();
        System.out.println("Guitar class");
    }

    @Override
    public void play() {
        System.out.println("Playing a Piano instrument");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the Piano instrument");
    }

    @Override
    public void repair() {
        System.out.println("Repairing the Piano instrument");
    }

    @Override
    public void store() {
        System.out.println("Storing the Piano instrument properly");
    }

    @Override
    public void amplify() {
        System.out.println("Amplifying the sound of the Piano instrument");
    }
}
