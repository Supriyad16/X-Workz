package com.xworkz.fest.work;

public class HairRunner {
    public static void main(String[] args) {

        Hair hair = new Hairband();
        hair.grow();
        hair.style();
        hair.color();
        hair.wash();
        hair.protect();


        Hairband hairband = new Hairband();
        hairband.holdHair();
        hairband.differentStyles();
        hairband.madeOfDifferentMaterials();
        hairband.usedForFashion();
        hairband.availableInVariousColors();
    }
}
