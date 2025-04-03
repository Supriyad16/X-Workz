package com.xworkz.fest.work;

public class IceRunner {
    public static void main(String[] args) {

        Ice ice = new Cool();
        ice.freeze();
        ice.melt();
        ice.floatOnWater();
        ice.maintainTemperature();
        ice.formCrystals();


        Cool cool = new Cool();
        cool.refreshAir();
        cool.lowerBodyTemperature();
        cool.preserveFood();
        cool.provideComfort();
        cool.preventOverheating();
    }
}
