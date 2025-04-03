package com.xworkz.fest.work;

public class AirRunner {
    public static void main(String[] args) {
        // Using parent class reference
        Air air = new Fan();
        air.flow();
        air.carryOxygen();
        air.changeTemperature();
        air.spreadSmell();
        air.createWind();



        // Using child class reference
        Fan fan = new Fan();
        fan.rotateBlades();
        fan.increaseSpeed();
        fan.decreaseSpeed();
        fan.consumeElectricity();
        fan.coolTheRoom();
    }
}

