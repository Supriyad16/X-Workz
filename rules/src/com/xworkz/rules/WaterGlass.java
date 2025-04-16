package com.xworkz.rules;

public class WaterGlass implements Glass {

    @Override
    public void fill() {
        System.out.println("Filling the water glass");
    }

    @Override
    public void drink() {
        System.out.println("Drinking from the water glass");
    }

    @Override
    public void empty() {
        System.out.println("Emptying the water glass");
    }

    public static void main(String[] args) {
        WaterGlass glass = new WaterGlass();
        glass.fill();
        glass.drink();
        glass.empty();
    }
}
