package com.xworkz.rules;

public class Link implements Chain, Chair {

    @Override
    public void link() {
        System.out.println("Connecting the chain links");
    }

    @Override
    public void lock() {
        System.out.println("Securing the chain");
    }

    @Override
    public void swing() {
        System.out.println("Opening the chain");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on the chair");
    }

    @Override
    public void move() {
        System.out.println("Adjusting the chair height");
    }

    @Override
    public void fold() {
        System.out.println("Rotating the chair");
    }

    public static void main(String[] args) {
        Chain chain = new Link();
        chain.link();
        chain.lock();
        chain.swing();

        Chair chair = new Link();
        chair.sit();
        chair.fold();
        chair.move();
    }
}
