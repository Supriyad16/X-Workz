package com.xworkz.fest.work;

class Hairband extends Hair {
    Hairband() {
        super();
        System.out.println("Hairband object created to manage and style hair.");
    }

    @Override
    public void grow() {
        System.out.println("Initiating the process: hair starts to grow naturally.");
    }

    @Override
    public void style() {
        System.out.println("Styling hair with the help of accessories like a hairband.");
    }

    @Override
    public void color() {
        System.out.println("Applying color to enhance or change hair appearance.");
    }

    @Override
    public void wash() {
        System.out.println("Washing hair to maintain hygiene and freshness.");
    }

    @Override
    public void protect() {
        System.out.println("Protecting hair from damage using bands, scarves, or products.");
    }
}
