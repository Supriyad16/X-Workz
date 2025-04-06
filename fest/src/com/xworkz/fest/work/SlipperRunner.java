package com.xworkz.fest.work;

public class SlipperRunner {
    public static void main(String[] args) {

        Slipper slipper = new Leather();
        slipper.comfort();
        slipper.walk();
        slipper.variousSizes();
        slipper.differentMaterials();
        slipper.lightweight();


        Leather leather = new Leather();
        leather.comfort();
        leather.walk();
        leather.variousSizes();
        leather.differentMaterials();
        leather.lightweight();
    }
}
