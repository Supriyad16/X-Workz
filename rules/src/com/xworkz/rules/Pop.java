package com.xworkz.rules;

public class Pop implements Can, Cap {

    @Override
    public void openLid() {
        System.out.println("Opening the can");
    }

    @Override
    public void pour() {
        System.out.println("Drinking from the can");
    }

    @Override
    public void refill() {
        System.out.println("Crushing the can");
    }

    @Override
    public void wear() {
        System.out.println("Wearing the cap");
    }

    @Override
    public void remove() {
        System.out.println("Removing the cap");
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting the cap");
    }

    public static void main(String[] args) {
        Can can = new Pop();
        can.openLid();
        can.pour();
        can.refill();

        Cap cap = new Pop();
        cap.wear();
        cap.remove();
        cap.adjust();
    }
}
