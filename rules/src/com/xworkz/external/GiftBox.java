package com.xworkz.external;

import com.xworkz.rules.Box;

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

    @Override
    public void closed(){
        System.out.println("Gift box is closed");
    }
    public static void main(String[] args) {
        GiftBox giftBox = new GiftBox();
        giftBox.pack();
        giftBox.open();
        giftBox.seal();
        giftBox.closed();
    }
}
