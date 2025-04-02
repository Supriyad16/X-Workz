package com.xworkz.fest.work;


public class WashingMachine extends Appliance {

    WashingMachine() {
        super();
        System.out.println("Washing Machine class");
    }

    public void washClothes() {
        System.out.println("Washing machine washes clothes");
    }

    public void rinse() {
        System.out.println("Washing machine rinses clothes");
    }

    public void spinDry() {
        System.out.println("Washing machine dries clothes");
    }

    public void detergentUsage() {
        System.out.println("Washing machine uses detergent");
    }

    public void setTimer() {
        System.out.println("Washing machine has a timer setting");
    }
}


