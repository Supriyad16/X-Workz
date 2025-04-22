package com.xworkz.information.internal;

public class CoffeeImp implements Coffee {

    public CoffeeImp() {
        System.out.println("No-arg constructor of CoffeeImp");
    }

    @Override
    public void brew() {
        System.out.println("Running brew in CoffeeImp");
    }
}
