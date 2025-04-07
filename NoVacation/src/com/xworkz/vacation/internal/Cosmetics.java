package com.xworkz.vacation.internal;


class Cosmetics extends Bag {
    Cosmetics() {
        super(); // Calls the parent class constructor
        System.out.println("Cosmetics class");
    }

    @Override
    public void carryItems() {
        System.out.println("Bag is used to carry cosmetics.");
    }

    @Override
    public void openBag() {
        System.out.println("Open the bag.");
    }

    @Override
    public void closeBag() {
        System.out.println("Close the bag.");
    }

    @Override
    public void checkCapacity() {
        System.out.println("Check the capacity of the bag.");
    }

    @Override
    public void adjustStrap() {
        System.out.println("Adjust the bag strap.");
    }

    public void storage() {
        System.out.println("Bag have enough space.");
    }
}

