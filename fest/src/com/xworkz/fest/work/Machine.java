package com.xworkz.fest.work;

public class Machine extends Robot {

    Machine() {
        super();
        System.out.println("AI Robot is learning.");
    }

    @Override
    public void move() {
        System.out.println("Machine is moving.");
    }

    @Override
    public void stop() {
        System.out.println("Machine stopped.");
    }

    @Override
    public void recharge() {
        System.out.println("Machine is recharging.");
    }

    @Override
    public void scanArea() {
        System.out.println("Machine the surroundings.");
    }

    @Override
    public void pickObjects() {
        System.out.println("Machine up objects.");
    }
}