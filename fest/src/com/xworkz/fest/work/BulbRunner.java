package com.xworkz.fest.work;

public class BulbRunner {
    public static void main(String[] args) {


        Bulb bulb = new Dim();
        bulb.produceLight();
        bulb.consumeElectricity();
        bulb.availableInDifferentTypes();
        bulb.usedForIllumination();
        bulb.differentBrightnessLevels();


        Dim dim = new Dim();
        dim.reduceBrightness();
        dim.savesEnergy();
        dim.createsSoftAmbiance();
        dim.usedForDecorativePurposes();
        dim.preferredForRelaxation();
    }
}
