package com.xworkz.fest.work;

public class ApplianceRunner {

    public static void main(String[] args) {

        Appliance appliance = new WashingMachine();
        appliance.turnOn();
        appliance.turnOff();
        appliance.consumePower();
        appliance.warranty();
        appliance.maintenance();



        WashingMachine washingMachine = new WashingMachine();
        washingMachine.washClothes();
        washingMachine.rinse();
        washingMachine.spinDry();
        washingMachine.detergentUsage();
        washingMachine.setTimer();
    }
}


