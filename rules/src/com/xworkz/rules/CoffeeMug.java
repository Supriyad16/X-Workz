package com.xworkz.rules;

public class CoffeeMug implements Mug {

    @Override
    public void fill() {
        System.out.println("Filling the coffee mug");
    }

    @Override
    public void sip() {
        System.out.println("Sipping from the coffee mug");
    }

    @Override
    public void wash() {
        System.out.println("Washing the coffee mug");
    }

    public static void main(String[] args) {
        CoffeeMug mug = new CoffeeMug();
        mug.fill();
        mug.sip();
        mug.wash();
    }
}
