package com.xworkz.fest.work;

public class BagRunner {
    public static void main(String[] args) {

        Bag bag = new Cosmetics();
        bag.carryItems();
        bag.openBag();
        bag.closeBag();
        bag.checkCapacity();
        bag.adjustStrap();


        Cosmetics cosmetics = new Cosmetics();
        cosmetics.carryItems();
        cosmetics.openBag();
        cosmetics.closeBag();
        cosmetics.checkCapacity();
        cosmetics.adjustStrap();
    }
}
