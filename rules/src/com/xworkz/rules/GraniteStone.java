package com.xworkz.rules;

public class GraniteStone implements Stone {

    @Override
    public void throwStone() {
        System.out.println("Throwing the granite stone");
    }

    @Override
    public void carve() {
        System.out.println("Carving the granite stone");
    }

    @Override
    public void polish() {
        System.out.println("Polishing the granite stone");
    }

    public static void main(String[] args) {
        GraniteStone stone = new GraniteStone();
        stone.throwStone();
        stone.carve();
        stone.polish();
    }
}
