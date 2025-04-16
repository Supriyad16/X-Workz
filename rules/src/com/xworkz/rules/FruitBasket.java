package com.xworkz.rules;

public class FruitBasket implements Basket {

    @Override
    public void open() {
        System.out.println("Opening the fruit basket");
    }

    @Override
    public void close() {
        System.out.println("Closing the fruit basket");
    }

    @Override
    public void carryItems() {
        System.out.println("Carrying fruits in the basket");
    }

    public static void main(String[] args) {
        FruitBasket basket = new FruitBasket();
        basket.open();
        basket.close();
        basket.carryItems();
    }
}
