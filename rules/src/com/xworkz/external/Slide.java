package com.xworkz.external;

import com.xworkz.rules.*;

public class Slide implements Bench, Lid, Fan, Key, Chain {

    @Override
    public void sit() {
        System.out.println("Sitting on the bench");
    }

    @Override
    public void move() {
        System.out.println("Sliding down");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the bench");
    }

    @Override
    public void link() {
        System.out.println("Linking the chain");
    }

    @Override
    public void swing() {
        System.out.println("Chain is swinging");
    }

    @Override
    public void lock() {
        System.out.println("Locking the key");
    }

    @Override
    public void spin() {
        System.out.println("Fan is spinning");
    }

    @Override
    public void switchOn() {
        System.out.println("Switching on the fan");
    }

    @Override
    public void cleans() {
        System.out.println("Fan is being cleaned");
    }

    @Override
    public void insert() {
        System.out.println("Inserting the key");
    }

    @Override
    public void turn() {
        System.out.println("Turning the key");
    }

    @Override
    public void remove() {
        System.out.println("Removing the key");
    }

    @Override
    public void cover() {
        System.out.println("Covering with the lid");
    }

    @Override
    public void open() {
        System.out.println("Opening the lid");
    }

    @Override
    public void seal() {
        System.out.println("Sealing the lid");
    }

    public static void main(String[] args) {
        Bench bench = new Slide();
        bench.sit();
        bench.move();
        bench.clean();

        Chain chain = new Slide();
        chain.link();
        chain.swing();

        Fan fan = new Slide();
        fan.spin();
        fan.switchOn();
        fan.cleans();

        Key key = new Slide();
        key.insert();
        key.turn();
        key.remove();

        Lid lid = new Slide();
        lid.cover();
        lid.open();
        lid.seal();
    }
}