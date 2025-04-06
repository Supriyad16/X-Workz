package com.xworkz.fest.work;

class Noodles extends Chinese {
    Noodles() {
        super();
        System.out.println("Noodles class");
    }

    @Override
    public void popularCuisine() {
        System.out.println("Chinese cuisine is cuisines.");
    }

    @Override
    public void richInFlavors() {
        System.out.println("Chinese food is known for its rich flavors.");
    }

    @Override
    public void chopsticks() {
        System.out.println("Noodles eaten using chopsticks.");
    }

    @Override
    public void varietyOfDishes() {
        System.out.println("Chinese cuisine includes a variety of dishes.");
    }

    @Override
    public void spices() {
        System.out.println("Chinese food often includes a mix of spices.");
    }
}