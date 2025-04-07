package com.xworkz.vacation.internal;

public class BagRunner {
    public static void main(String[] args) {

        Bag bag = new Cosmetics();
        bag.carryItems();
        bag.openBag();
        bag.closeBag();
        bag.checkCapacity();
        bag.adjustStrap();

        System.out.println("----");

        Cosmetics cosmetics = new Cosmetics();
        cosmetics.carryItems();
        cosmetics.openBag();
        cosmetics.closeBag();
        cosmetics.checkCapacity();
        cosmetics.adjustStrap();

        System.out.println("----");

        MakeUp makeUp = new MakeUp();
        makeUp.adjustStrap();
        makeUp.carryItems();
        makeUp.closeBag();
        makeUp.openBag();
        makeUp.storage();
        makeUp.checkCapacity();
    }
}
