package com.xworkz.poster.multilevel;

public class Fungus extends Water {

    public Fungus(String type, String color) {
        super(type, color);
    }

    public void decompose() {
        System.out.println("Fungus helps in decomposition");
    }

    public static void main(String[] args) {
        Fungus fungus = new Fungus("Green Algae", "Green");
        System.out.println("Type: " + fungus.type + ", Color: " + fungus.color);
        fungus.grow();
        fungus.flow();
        fungus.decompose();
    }
}
