package com.xworkz.external;

import com.xworkz.rules.Bag;

public class SlingBag implements Bag {



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

    @Override
    public void design() {
        System.out.println("Slig bag has design");
    }

    public static void main(String[] args) {
        SlingBag slingBag = new SlingBag();
        slingBag.carry();
        slingBag.hold();
        slingBag.store();
        slingBag.design();
    }
}

