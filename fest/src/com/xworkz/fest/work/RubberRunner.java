package com.xworkz.fest.work;

public class RubberRunner {

    public static void main(String[] args) {

        Rubber rubber = new Tyre();
        rubber.expand();
       // rubber.compress(); the datatype is rubber hence it won't work

        Rubber rubber1 = new Rubber();
        rubber1.expand();

        Tyre tyre = new Tyre();
        tyre.hard(); // implementation from tyre
        tyre.compress(); // implementation from tyre
        tyre.expand(); // implementation from parent

        MrfTyre mrfTyre = new MrfTyre();
        mrfTyre.brand();
        mrfTyre.radial();
        mrfTyre.compress();
        mrfTyre.expand();

        ArmyVehicle armyVehicle = new ArmyVehicle();
        armyVehicle.vehicle(rubber);
        armyVehicle.vehicle(rubber1);
        armyVehicle.vehicle(tyre);
        armyVehicle.vehicle(mrfTyre);

    }
}
