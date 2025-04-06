package com.xworkz.fest.work;

public class AirRunner {
    public static void main(String[] args) {

        Air air = new Fan();
        air.flow();
        air.carryOxygen();
        air.changeTemperature();
        air.spreadSmell();
        air.createWind();


        Fan fan = new Fan();
        fan.flow();
        fan.carryOxygen();
        fan.changeTemperature();
        fan.spreadSmell();
        fan.createWind();
    }
}

