package com.xworkz.rules;

public class CowboyHat implements Hat {

    @Override
    public void wear() {
        System.out.println("Wearing the cowboy hat");
    }

    @Override
    public void remove() {
        System.out.println("Removing the cowboy hat");
    }

    @Override
    public void style() {
        System.out.println("Styling the cowboy hat");
    }

    public static void main(String[] args) {
        CowboyHat hat = new CowboyHat();
        hat.wear();
        hat.remove();
        hat.style();
    }
}
