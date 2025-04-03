package com.xworkz.fest.work;

class Charger extends Mobile {
    Charger() {
        super(); // Calls the parent class constructor
        System.out.println("Charger class");
    }

    public void connectToMobile() {
        System.out.println("Connecting the charger to the mobile.");
    }

    public void supplyPower() {
        System.out.println("Supplying power to the mobile.");
    }

    public void fastCharging() {
        System.out.println("Fast charging the mobile.");
    }

    public void stopCharging() {
        System.out.println("Stopping the charging process.");
    }

    public void checkBatteryStatus() {
        System.out.println("Checking the mobile battery percentage.");
    }
}