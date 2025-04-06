package com.xworkz.fest.work;

class Light extends Torch {
    Light() {
        super();
        System.out.println("Light class");
    }

    @Override
    public void turnOn() {
        System.out.println("Torch is turned on in light.");
    }

    @Override
    public void turnOff() {
        System.out.println("Torch is turned off in light.");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Torch have brightness.");
    }

    @Override
    public void portable() {
        System.out.println("Torch is a portable electronic item.");
    }

    @Override
    public void batteryOperated() {
        System.out.println("Torch usually runs on batteries or charger.");
    }
}

