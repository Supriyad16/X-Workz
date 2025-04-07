package com.xworkz.vacation.internal;

public class ElectricityRunner {
    public static void main(String[] args) {


        Electricity electricity = new ElectricTrain();
        electricity.generate();
        electricity.transmit();
        electricity.store();
        electricity.shock();
        electricity.powerDevices();

        System.out.println("----");

        ElectricTrain electricTrain = new ElectricTrain();
        electricTrain.generate();
        electricTrain.transmit();
        electricTrain.shock();
        electricTrain.store();
        electricTrain.powerDevices();

        System.out.println("----");

        ElectricBus electricBus = new ElectricBus();
        electricBus.generate();
        electricBus.powerDevices();
        electricBus.store();
        electricBus.transmit();
        electricBus.work();
        electricBus.shock();

    }
}