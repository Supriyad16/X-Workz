package com.xworkz.fest.work;

public class IronBoxRunner {
    public static void main(String[] args) {

        IronBox ironBox = new Heat();
        ironBox.pressClothes();
        ironBox.usesElectricity();
        ironBox.adjustableTemperature();
        ironBox.availableInDifferentTypes();
        ironBox.commonlyUsedInHomes();


        Heat heat = new Heat();
        heat.generatedByIronBox();
        heat.helpsRemoveWrinkles();
        heat.variesWithTemperatureSetting();
        heat.transfersThroughMetalPlate();
        heat.requiredForEfficientIroning();
    }
}
