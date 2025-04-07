package com.xworkz.vacation.internal;

class Shirt extends Nylon {
    Shirt() {
        super();
                System.out.println("Shirt class");
    }

@Override
public void syntheticFiber() {
    System.out.println("Nylon is a synthetic fiber.");
}

@Override
public void durable() {
    System.out.println("Nylon is known for its durability.");
}

@Override
public void waterResistant() {
    System.out.println("Nylon is water-resistant.");
}

@Override
public void lightweight() {
    System.out.println("Nylon is lightweight.");
}

@Override
public void widelyUsedInTextiles() {
    System.out.println("Nylon is widely used in the textile industry.");
}
}