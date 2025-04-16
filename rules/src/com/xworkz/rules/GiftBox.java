package com.xworkz.rules;

public class GiftBox implements Box {

    @Override
    public void pack() {
        System.out.println("Packing the gift box");
    }

    @Override
    public void open() {
        System.out.println("Opening the gift box");
    }

    @Override
    public void seal() {
        System.out.println("Sealing the gift box");
    }

    public static void main(String[] args) {
        GiftBox box = new GiftBox();
        box.pack();
        box.open();
        box.seal();
    }
}
