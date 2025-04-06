package com.xworkz.fest.work;

public class BedRunner {
    public static void main(String[] args) {

        Bed bed = new Pillow();
        bed.comfort();
        bed.differentMaterials();
        bed.differentSizes();
        bed.sleep();
        bed.study();


        Pillow pillow = new Pillow();
        pillow.comfort();
        pillow.differentMaterials();
        pillow.differentSizes();
        pillow.sleep();
        pillow.study();
    }
}
