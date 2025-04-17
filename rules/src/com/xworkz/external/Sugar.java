package com.xworkz.external;

import com.xworkz.rules.*;

public class Sugar implements Basket, Door, Chair, Can, Mat {

    @Override
    public void open() {
        System.out.println("Opening the door");
    }

    @Override
    public void close() {
        System.out.println("Closing the door");
    }

    @Override
    public void lock() {
        System.out.println("Locking the door");
    }

    @Override
    public void carryItems() {
        System.out.println("Carrying items in the basket");
    }

    @Override
    public void pour() {
        System.out.println("Pouring from the can");
    }

    @Override
    public void openLid() {
        System.out.println("Opening the lid of the can");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the can");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on the chair");
    }

    @Override
    public void fold() {
        System.out.println("Folding the chair");
    }

    @Override
    public void move() {
        System.out.println("Moving the chair");
    }

    @Override
    public void lay() {
        System.out.println("Laying the mat");
    }

    @Override
    public void step() {
        System.out.println("Stepping on the mat");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the mat");
    }

    public static void main(String[] args) {
        Basket basket = new Sugar();
        basket.carryItems();
        basket.close();
        basket.open();

        Door door = new Sugar();
        door.open();
        door.close();
        door.lock();

        Can can = new Sugar();
        can.openLid();
        can.pour();
        can.refill();

        Chair chair = new Sugar();
        chair.sit();
        chair.fold();
        chair.move();

        Mat mat = new Sugar();
        mat.lay();
        mat.step();
        mat.clean();
    }
}
