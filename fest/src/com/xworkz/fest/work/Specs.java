package com.xworkz.fest.work;

public class Specs extends Glass {
        Specs() {
        super();
        System.out.println("Specs are used for vision correction");
    }

    @Override
    public void material() {
        System.out.println("Glass is made from silica.");
    }

    @Override
    public void transparency() {
        System.out.println("Glass allows light to pass through it.");
    }

    @Override
    public void fragile() {
        System.out.println("Glass is fragile.");
    }

    @Override
    public void reflect() {
        System.out.println("Glass reflect light.");
    }

    @Override
    public void heatResistance() {
        System.out.println("Some glass are heat-resistant.");
    }

}