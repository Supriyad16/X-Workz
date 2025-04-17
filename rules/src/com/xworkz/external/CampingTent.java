package com.xworkz.external;

import com.xworkz.rules.Tent;

public class CampingTent implements Tent {

    @Override
    public void setUp() {
        System.out.println("Setting up the camping tent");
    }

    @Override
    public void fold() {
        System.out.println("Folding the camping tent");
    }

    @Override
    public void shelter() {
        System.out.println("Providing shelter with the camping tent");
    }

    @Override
    public void trip(){
        System.out.println("tent used in camps");
    }

    public static void main(String[] args) {
        CampingTent campingTent = new CampingTent();
        campingTent.setUp();
        campingTent.fold();
        campingTent.shelter();
        campingTent.trip();
    }
}
