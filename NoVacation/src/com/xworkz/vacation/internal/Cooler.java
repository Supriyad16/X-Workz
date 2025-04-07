package com.xworkz.vacation.internal;

public class Cooler extends Fan {

    public void cold(Air air) {
        air.flow();

        if (air instanceof Fan) {

            Fan fan = (Fan) air;
            fan.carryOxygen();
            fan.cool();
            fan.changeTemperature();
            fan.createWind();
            fan.spreadSmell();
            fan.flow();

        }
    }
}

