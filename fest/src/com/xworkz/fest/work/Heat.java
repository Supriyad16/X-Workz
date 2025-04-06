package com.xworkz.fest.work;

class Heat extends IronBox {
    Heat() {
        super();
        System.out.println("Heat class");
    }

    @Override
    public void pressClothes() {
        System.out.println("IronBox is used to remove wrinkles from clothes.");
    }

    @Override
    public void usesElectricity() {
        System.out.println("IronBox generates heat.");
    }

    @Override
    public void adjustableTemperature() {
        System.out.println("IronBox allows adjusting temperature.");
    }

    @Override
    public void differentTypes() {
        System.out.println("IronBoxes comes in  and dry types.");
    }

    @Override
    public void used() {
        System.out.println("IronBox is used in common household appliance.");
    }
}