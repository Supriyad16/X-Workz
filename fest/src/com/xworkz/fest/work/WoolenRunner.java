package com.xworkz.fest.work;

public class WoolenRunner {
    public static void main(String[] args) {

        Woolen woolen = new Towel();
        woolen.providesWarmth();
        woolen.softTexture();
        woolen.absorbsMoisture();
        woolen.durable();
        woolen.usedInClothing();


        Towel towel = new Towel();
        towel.absorbsWater();
        towel.usedAfterBathing();
        towel.availableInVariousSizes();
        towel.madeOfDifferentMaterials();
        towel.easyToWash();
    }
}
