package com.xworkz.poster.multilevel;

public class Bracelet extends Ring {

    public Bracelet(String material, String design) {
        super(material, design);
    }

    public void wearBracelet() {
        System.out.println("Wearing a stylish bracelet");
    }

    public static void main(String[] args) {
        Bracelet bracelet = new Bracelet("Gold", "Traditional");
        System.out.println("Material: " + bracelet.material + ", Design: " + bracelet.design);
        bracelet.wearNecklace();
        bracelet.wearRing();
        bracelet.wearBracelet();
    }
}