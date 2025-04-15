package com.xworkz.poster.multilevel;

public class Bus extends Bike {

    public Bus(String brand, int cost) {
        super(brand, cost);
    }

    public void carryPassengers() {
        System.out.println("Bus carries many passengers");
    }
}
