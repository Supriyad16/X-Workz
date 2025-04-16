package com.xworkz.rules;

public class FoamBed implements Bed {

    @Override
    public void sleep() {
        System.out.println("Sleeping on the foam bed");
    }

    @Override
    public void fold() {
        System.out.println("Folding the foam bed");
    }

    @Override
    public void makeBed() {
        System.out.println("Making the foam bed");
    }

    public static void main(String[] args) {
        FoamBed bed = new FoamBed();
        bed.sleep();
        bed.fold();
        bed.makeBed();
    }
}
