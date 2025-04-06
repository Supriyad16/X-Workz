package com.xworkz.fest.work;

public class Shop extends Vegetable {

    Shop() {
        super();
        System.out.println("Shop sells vegetables");
    }

    @Override
    public void grow() {
        System.out.println("Vegetables grows in soil");
    }

    @Override
    public void harvest() {
        System.out.println("Vegetables are harvested.");
    }

    @Override
    public void sell() {
        System.out.println("Vegetables are sold.");
    }

    @Override
    public void cook() {
        System.out.println("Vegetables are cooked.");
    }

    @Override
    public void nutrients() {
        System.out.println("Vegetables provide nutrients.");

    }
}