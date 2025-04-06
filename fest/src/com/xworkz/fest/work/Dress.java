package com.xworkz.fest.work;

class Dress extends Cotton {
    Dress() {
        super();
        System.out.println("Dress class");
    }

    @Override
    public void softTexture() {
        System.out.println("Cotton dress has a soft and comfortable texture.");
    }

    @Override
    public void breathable() {
        System.out.println("Cotton dress  allows air circulation and keeps the body cool.");
    }

    @Override
    public void absorbsMoisture() {
        System.out.println("Cotton dress absorbs moisture, making it ideal for summer wear.");
    }

    @Override
    public void ecoFriendly() {
        System.out.println("Cotton dress are biodegradable fiber.");
    }

    @Override
    public void usedInTextiles() {
        System.out.println("Cotton is widely used in the textile industry to produce dress.");
    }
}