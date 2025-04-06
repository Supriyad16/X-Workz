package com.xworkz.fest.work;

class Lion extends Forest {
    Lion() {
        super();
        System.out.println("Lion class");
    }

    @Override
    public void providesOxygen() {
        System.out.println("Forest provides oxygen to the Lion.");
    }

    @Override
    public void shelter() {
        System.out.println("Forest is home to various wild animals.");
    }

    @Override
    public void largeArea() {
        System.out.println("Forests cover a significant portion.");
    }

    @Override
    public void ecosystem() {
        System.out.println("Forests help maintain the ecological system.");
    }

    @Override
    public void resources() {
        System.out.println("Forests provide resources.");
    }
}