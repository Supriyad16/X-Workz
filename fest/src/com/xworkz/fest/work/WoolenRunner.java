package com.xworkz.fest.work;

public class WoolenRunner {
    public static void main(String[] args) {

        Woolen woolen = new Towel();
        woolen.warmth();
        woolen.soft();
        woolen.absorbsMoisture();
        woolen.durable();
        woolen.usedInClothing();

        Towel towel = new Towel();
        towel.warmth();
        towel.soft();
        towel.absorbsMoisture();
        towel.durable();
        towel.usedInClothing();
    }
}
