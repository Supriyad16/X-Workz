package com.xworkz.rules;

public class SlingBag implements Bag{



    @Override
    public void carry() {
        System.out.println("Carry the bag");

    }

    @Override
    public void hold() {
        System.out.println("Hold the bag");

    }

    @Override
    public void store() {
        System.out.println("Store the items");

    }

    public static void main(String[] args) {
        SlingBag slingBag = new SlingBag();
        slingBag.carry();
        slingBag.hold();
        slingBag.store();
    }
}

