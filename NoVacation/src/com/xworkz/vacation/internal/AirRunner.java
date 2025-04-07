package com.xworkz.vacation.internal;

public class AirRunner {
    public static void main(String[] args) {

        Air air = new Fan();
        air.flow();
        air.carryOxygen();
        air.changeTemperature();
        air.spreadSmell();
        air.createWind();

        System.out.println("----");

        Fan fan = new Fan();
        fan.flow();
        fan.carryOxygen();
        fan.changeTemperature();
        fan.spreadSmell();
        fan.createWind();

        System.out.println("----");

        Cooler cooler = new Cooler();
        cooler.carryOxygen();
        cooler.cool();
        cooler.changeTemperature();
        cooler.createWind();
        cooler.spreadSmell();
        cooler.flow();
    }
}