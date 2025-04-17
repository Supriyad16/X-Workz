package com.xworkz.external;

import com.xworkz.rules.Basket;
import com.xworkz.rules.Bed;

public class Nap implements Bed, Basket {

    @Override
    public void sleep() {
        System.out.println("Sleeping on the wooden bed");
    }

    @Override
    public void makeBed() {
        System.out.println("Arranging the bed covers");
    }

    @Override
    public void fold() {
        System.out.println("Taking rest on the bed");
    }

    @Override
    public void carryItems() {
        System.out.println("Carrying fruits in the basket");
    }

    @Override
    public void open() {
        System.out.println("Weaving the fruit basket");
    }

    @Override
    public void close() {
        System.out.println("Emptying the basket");
    }

    public static void main(String[] args) {
        Bed bed = new Nap();
        bed.sleep();
        bed.makeBed();
        bed.fold();

        Basket basket = new Nap();
        basket.carryItems();
        basket.open();
        basket.close();
    }
}
