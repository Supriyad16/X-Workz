package com.xworkz.vacation.internal;

class Paper extends Kite {
    Paper() {
        super();
        System.out.println("Paper class");
    }

    @Override
    public void fly() {
        System.out.println("The Paper kite flies high in the sky.");
    }

    @Override
    public void string() {
        System.out.println("The Paper kite needs a string to be controlled.");
    }

    @Override
    public void shapes() {
        System.out.println("Paper Kites come in different shapes and sizes.");
    }

    @Override
    public void festivals() {
        System.out.println("Paper Kites are flown during various festivals.");
    }

    @Override
    public void lightMaterial() {
        System.out.println("Kites are made of lightweight materials like paper.");
    }

}