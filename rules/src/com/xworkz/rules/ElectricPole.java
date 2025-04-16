package com.xworkz.rules;

public class ElectricPole implements Pole {

    @Override
    public void stand() {
        System.out.println("The electric pole is standing");
    }

    @Override
    public void support() {
        System.out.println("The electric pole supports power lines");
    }

    @Override
    public void climb() {
        System.out.println("Climbing the electric pole");
    }

    public static void main(String[] args) {
        ElectricPole pole = new ElectricPole();
        pole.stand();
        pole.support();
        pole.climb();
    }
}
