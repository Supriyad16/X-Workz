package com.xworkz.vacation.internal;

public class NylonRunner {
    public static void main(String[] args) {

        Nylon nylon = new Shirt();
        nylon.syntheticFiber();
        nylon.durable();
        nylon.waterResistant();
        nylon.lightweight();
        nylon.widelyUsedInTextiles();


        Shirt shirt = new Shirt();
        shirt.syntheticFiber();
        shirt.durable();
        shirt.waterResistant();
        shirt.lightweight();
        shirt.waterResistant();

        Dress dress = new Dress();
        dress.syntheticFiber();
        dress.durable();
        dress.waterResistant();
        dress.lightweight();
        dress.waterResistant();

    }
}
