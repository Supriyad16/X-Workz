package com.xworkz.fest.work;

class Footpath extends Road {
    Footpath() {
        super();
        System.out.println("Footpath class");
    }

    @Override
    public void transportation() {
        System.out.println("Roads are made for vehicle transportation.");
    }

    @Override
    public void connectsPlaces() {
        System.out.println("Roads connect different places.");
    }

    @Override
    public void walk() {
        System.out.println("Roads can be made to walk.");
    }

    @Override
    public void traffic() {
        System.out.println("Roads have traffic rules.");
    }

    @Override
    public void construct() {
        System.out.println("Roads are constructed  by the government.");
    }
}