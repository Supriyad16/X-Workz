package com.xworkz.vacation.internal;

public class Wash extends WashingMachine{

    public void dry(Appliance appliance){

        appliance.turnOn();

        if(appliance instanceof WashingMachine){

            WashingMachine washingMachine = (WashingMachine) appliance;
            washingMachine.maintenance();
            washingMachine.clean();
            washingMachine.consumePower();
            washingMachine.turnOff();
            washingMachine.turnOn();
            washingMachine.warranty();
        }
    }
}
