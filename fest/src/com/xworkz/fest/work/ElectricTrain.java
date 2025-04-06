package com.xworkz.fest.work;

public class ElectricTrain extends Electricity {

    ElectricTrain() {
        super();
        System.out.println("ElectricTrain constructor invoked: Runs on electricity via tracks.");
    }

    @Override
    public void generate() {
        System.out.println("Generating electricity to power the electric train.");
    }

    @Override
    public void transmit() {
        System.out.println("Transmitting electricity to the train through overhead lines or rails.");
    }

    @Override
    public void store() {
        System.out.println("Storing electricity in onboard batteries or external power grids.");
    }

    @Override
    public void shock() {
        System.out.println("Shock alert: Electric trains carry high voltage—stay safe!");
    }

    @Override
    public void powerDevices() {
        System.out.println("Powering train systems and devices using electricity.");
    }
}
