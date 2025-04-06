package com.xworkz.fest.work;

public class IceRunner {
    public static void main(String[] args) {

        Ice ice = new Cool();
        ice.freeze();
        ice.melt();
        ice.floatOnWater();
        ice.temperature();
        ice.crystals();


        Cool cool = new Cool();
        cool.freeze();
        cool.melt();
        cool.floatOnWater();
        cool.temperature();
        cool.crystals();
    }
}
