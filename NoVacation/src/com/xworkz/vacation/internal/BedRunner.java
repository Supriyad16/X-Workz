package com.xworkz.vacation.internal;

public class BedRunner {
    public static void main(String[] args) {

        Bed bed = new Pillow();
        bed.comfort();
        bed.differentMaterials();
        bed.differentSizes();
        bed.sleep();
        bed.study();

        System.out.println("----");

        Pillow pillow = new Pillow();
        pillow.comfort();
        pillow.differentMaterials();
        pillow.differentSizes();
        pillow.sleep();
        pillow.study();

        System.out.println("----");

        Blanket blanket = new Blanket();
        blanket.sleep();
        blanket.study();
        blanket.colour();
        blanket.differentMaterials();
        blanket.differentSizes();
        blanket.comfort();
    }
}
