package com.xworkz.external;

import com.xworkz.rules.*;

public class Nest implements Bed, Hat, Cup, Knife, Drum {

    @Override
    public void sleep() {
        System.out.println("Sleeping on the bed");
    }

    @Override
    public void fold() {
        System.out.println("Folding the bed");
    }

    @Override
    public void makeBed() {
        System.out.println("Making the bed");
    }

    @Override
    public void pour() {
        System.out.println("Pouring into the cup");
    }

    @Override
    public void drink() {
        System.out.println("Drinking from the cup");
    }

    @Override
    public void wash() {
        System.out.println("Washing the cup");
    }

    @Override
    public void beat() {
        System.out.println("Beating the drum");
    }

    @Override
    public void carry() {
        System.out.println("Carrying the drum");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the drum");
    }

    @Override
    public void wear() {
        System.out.println("Wearing the hat");
    }

    @Override
    public void remove() {
        System.out.println("Removing the hat");
    }

    @Override
    public void style() {
        System.out.println("Styling the hat");
    }

    @Override
    public void cut() {
        System.out.println("Cutting with the knife");
    }

    @Override
    public void slice() {
        System.out.println("Slicing with the knife");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the knife");
    }

    public static void main(String[] args) {
        Bed bed = new Nest();
        bed.sleep();
        bed.fold();
        bed.makeBed();

        Cup cup = new Nest();
        cup.pour();
        cup.drink();
        cup.wash();

        Hat hat = new Nest();
        hat.wear();
        hat.remove();
        hat.style();

        Knife knife = new Nest();
        knife.cut();
        knife.slice();
        knife.clean();

        Drum drum = new Nest();
        drum.beat();
        drum.carry();
        drum.tune();
    }
}
