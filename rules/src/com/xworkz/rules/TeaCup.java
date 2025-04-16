package com.xworkz.rules;

public class TeaCup implements Cup {

    @Override
    public void pour() {
        System.out.println("Pouring tea into the teacup");
    }

    @Override
    public void drink() {
        System.out.println("Drinking tea from the teacup");
    }

    @Override
    public void wash() {
        System.out.println("Washing the teacup");
    }

    public static void main(String[] args) {
        TeaCup cup = new TeaCup();
        cup.pour();
        cup.drink();
        cup.wash();
    }
}
