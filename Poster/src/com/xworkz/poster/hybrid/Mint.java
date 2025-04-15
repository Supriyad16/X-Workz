package com.xworkz.poster.hybrid;

public class Mint extends Leaf {
    public void smell() {
        System.out.println("Mint smells fresh.");
    }

    public static void main(String[] args) {
        Mint mint = new Mint();
        mint.grow();
        mint.photosynthesis();
        mint.smell();

        Root root = new Root();
        root.grow();
        root.absorb();
    }
}
