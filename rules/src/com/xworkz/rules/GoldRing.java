package com.xworkz.rules;

public class GoldRing implements Ring {

    @Override
    public void wear() {
        System.out.println("Wearing the gold ring");
    }

    @Override
    public void remove() {
        System.out.println("Removing the gold ring");
    }

    @Override
    public void resize() {
        System.out.println("Resizing the gold ring");
    }

    public static void main(String[] args) {
        GoldRing ring = new GoldRing();
        ring.wear();
        ring.remove();
        ring.resize();
    }
}
