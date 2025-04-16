package com.xworkz.rules;

public class BathTub implements Tub {

    @Override
    public void fill() {
        System.out.println("Filling the bathtub with water");
    }

    @Override
    public void drain() {
        System.out.println("Draining the bathtub");
    }

    @Override
    public void soak() {
        System.out.println("Soaking in the bathtub");
    }

    public static void main(String[] args) {
        BathTub tub = new BathTub();
        tub.fill();
        tub.drain();
        tub.soak();
    }
}
