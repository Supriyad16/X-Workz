package com.xworkz.vacation.internal;

    public class ApplianceRunner {

        public static void main(String[] args) {

            Appliance appliance = new WashingMachine();
            appliance.turnOn();
            appliance.turnOff();
            appliance.consumePower();
            appliance.warranty();
            appliance.maintenance();

            System.out.println("----");

            WashingMachine washingMachine = new WashingMachine();
            washingMachine.turnOff();
            washingMachine.turnOff();
            washingMachine.consumePower();
            washingMachine.warranty();
            washingMachine.maintenance();

            System.out.println("----");

            Wash wash = new Wash();
            wash.maintenance();
            wash.clean();
            wash.consumePower();
            wash.turnOff();
            wash.turnOn();
            wash.warranty();
        }
}
