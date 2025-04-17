package com.xworkz.external;

import com.xworkz.rules.Glass;

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

    @Override
    public void refill(){
        System.out.println("refill water glass");
    }

    public static void main(String[] args) {
        WaterGlass waterGlass = new WaterGlass();
        waterGlass.fill();
        waterGlass.drink();
        waterGlass.empty();
    }
}
