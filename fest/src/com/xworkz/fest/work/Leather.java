package com.xworkz.fest.work;

class Leather extends Slipper {
    Leather() {
        super();
        System.out.println("Leather class");
    }

    @Override
    public void comfort() {
        System.out.println("Leather Slippers provide comfort to the feet.");
    }

    @Override
    public void walk() {
        System.out.println("Leather Slippers are commonly used for walking indoors and outdoors.");
    }

    @Override
    public void variousSizes() {
        System.out.println("Leather Slippers come in various sizes for different foot types.");
    }

    @Override
    public void differentMaterials() {
        System.out.println("Slippers can be made of leather.");
    }

    @Override
    public void lightweight() {
        System.out.println("Leather Slippers are designed to be lightweight and easy to wear.");
    }
}