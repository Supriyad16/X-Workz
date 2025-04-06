package com.xworkz.fest.work;

public class IronBoxRunner {
    public static void main(String[] args) {

        IronBox ironBox = new Heat();
        ironBox.pressClothes();
        ironBox.usesElectricity();
        ironBox.adjustableTemperature();
        ironBox.differentTypes();
        ironBox.used();

        Heat heat = new Heat();
        heat.pressClothes();
        heat.usesElectricity();
        heat.adjustableTemperature();
        heat.differentTypes();
        heat.used();
    }
}
