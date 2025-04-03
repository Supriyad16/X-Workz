package com.xworkz.fest.work;

public class BottleRunner {
    public static void main(String[] args) {

        Bottle bottle = new Steel();
        bottle.storeLiquid();
        bottle.reusable();
        bottle.differentSizes();
        bottle.portable();
        bottle.madeOfDifferentMaterials();

        Steel steel = new Steel();
        steel.durable();
        steel.maintainsTemperature();
        steel.ecoFriendly();
        steel.rustResistant();
        steel.hygienic();
    }
}
