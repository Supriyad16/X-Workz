package com.xworkz.external;

import com.xworkz.rules.Bed;

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

    public void peace(){
        System.out.println("Have peace in life");
    }

    public static void main(String[] args) {
        FoamBed foamBed = new FoamBed();
        foamBed.sleep();
        foamBed.fold();
        foamBed.makeBed();
        foamBed.peace();
    }
}
