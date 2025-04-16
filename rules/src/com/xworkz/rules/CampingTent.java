package com.xworkz.rules;

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

    public static void main(String[] args) {
        CampingTent tent = new CampingTent();
        tent.setUp();
        tent.fold();
        tent.shelter();
    }
}
