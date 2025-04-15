package com.xworkz.poster.singlelevel;

public class Ghee extends Butter {

    public Ghee(String flavor, String texture) {
        super(flavor, texture);
    }

    public void melt() {
        System.out.println("Ghee melts when heated");
    }

    public static void main(String[] args) {
        Ghee ghee = new Ghee("Salted", "Smooth");
        System.out.println("Flavor: " + ghee.flavor + ","+" Texture: " + ghee.texture);
        ghee.spread();
        ghee.melt();
    }
}
