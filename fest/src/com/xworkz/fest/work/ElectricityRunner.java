package com.xworkz.fest.work;

public class ElectricityRunner {
    public static void main(String[] args) {


        Electricity electricity = new ElectricTrain();
        electricity.generate();
        electricity.transmit();
        electricity.store();
        electricity.shock();
        electricity.powerDevices();


        ElectricTrain electricTrain = new ElectricTrain();
        electricTrain.startJourney();
        electricTrain.increaseSpeed();
        electricTrain.honk();
        electricTrain.stop();
        electricTrain.transportPeople();
    }
}
