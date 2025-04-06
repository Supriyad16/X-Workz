package com.xworkz.fest.work;

public class Tree extends Plant {

    Tree() {
        super();
        System.out.println("Tree class");
    }

    @Override
    public void grow() {
        System.out.println("Tree is growing.");
    }

    @Override
    public void absorbWater() {
        System.out.println("Tree absorbs water.");
    }

    @Override
    public void photosynthesis() {
        System.out.println("Tree performs photosynthesis.");
    }

    @Override
    public void oxygenRelease() {
        System.out.println("Tree releases oxygen.");
    }

    @Override
    public void provideShade() {
        System.out.println("Tree provides shade.");
    }
}