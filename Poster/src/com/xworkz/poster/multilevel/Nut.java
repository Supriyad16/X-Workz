package com.xworkz.poster.multilevel;

public class Nut extends Music {

    public Nut(String type, String brand) {
        super(type, brand);
    }

    public void holdStrings() {
        System.out.println("Nut holds the strings in position on the guitar neck");
    }

    public static void main(String[] args) {
        Nut nut = new Nut("Bone", "Yamaha");
        System.out.println("Type: " + nut.type + ", Brand: " + nut.brand);
        nut.play();
        nut.vibrate();
        nut.holdStrings();
    }
}
