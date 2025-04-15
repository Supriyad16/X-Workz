package com.xworkz.poster.multilevel;

public class Crocs extends Slipper {

    public Crocs(String brand, int size) {
        super(brand, size);
    }

    public void floatWalk() {
        System.out.println("Walking with Crocs comfortably");
    }

    public static void main(String[] args) {
        Crocs crocs = new Crocs("Walkmate", 4);
        System.out.println("Brand: " + crocs.brand + ", Size: " + crocs.size);
        crocs.wear();
        crocs.run();
        crocs.relax();
        crocs.floatWalk();
    }
}
