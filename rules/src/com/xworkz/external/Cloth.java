package com.xworkz.external;

import com.xworkz.rules.*;

public class Cloth implements Chain, Chair, Can, Cap, Cup {

    @Override
    public void pour() {
        System.out.println("Pouring drink into the cup");
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
    public void openLid() {
        System.out.println("Opening the can lid");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the can");
    }

    @Override
    public void wear() {
        System.out.println("Wearing the cap");
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting the cap");
    }

    @Override
    public void remove() {
        System.out.println("Removing the cap");
    }

    @Override
    public void link() {
        System.out.println("Linking the chain");
    }

    @Override
    public void swing() {
        System.out.println("Swinging the chain");
    }

    @Override
    public void lock() {
        System.out.println("Locking the chain");
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

    public static void main(String[] args) {
        Cup cup = new Cloth();
        cup.pour();
        cup.drink();
        cup.wash();

        Can can = new Cloth();
        can.openLid();
        can.refill();

        Cap cap = new Cloth();
        cap.wear();
        cap.adjust();
        cap.remove();

        Chain chain = new Cloth();
        chain.link();
        chain.swing();
        chain.lock();

        Chair chair = new Cloth();
        chair.sit();
        chair.fold();
        chair.move();
    }
}
