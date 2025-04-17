package com.xworkz.external;

import com.xworkz.rules.Mug;

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

    @Override
    public void drink(){
        System.out.println("drink coffee using mug");
    }

    public static void main(String[] args) {
        CoffeeMug coffeeMug = new CoffeeMug();
        coffeeMug.fill();
        coffeeMug.sip();
        coffeeMug.wash();
        coffeeMug.drink();
    }
}
