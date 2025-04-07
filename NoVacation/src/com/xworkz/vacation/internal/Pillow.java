package com.xworkz.vacation.internal;

class Pillow extends Bed {
    Pillow() {
        super();
        System.out.println("Pillow class");
    }

    @Override
    public void comfort() {
        System.out.println("The bed provides comfort.");
    }

    @Override
    public void differentSizes() {
        System.out.println("Beds come in different sizes.");
    }

    @Override
    public void differentMaterials() {
        System.out.println("Beds can be made of differentMaterials.");
    }

    @Override
    public void sleep() {
        System.out.println("A good bed supports body posture.");
    }

    @Override
    public void study() {
        System.out.println("Study on bed.");
    }

    public void colour() {
        System.out.println("Beds can be made of different colours.");
    }

}