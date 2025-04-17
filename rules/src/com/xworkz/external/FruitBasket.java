package com.xworkz.external;

import com.xworkz.rules.Basket;

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

    @Override
    public void hold(){
        System.out.println("Hold  items");
    }

    public static void main(String[] args) {
        FruitBasket fruitBasket = new FruitBasket();
        fruitBasket.open();
        fruitBasket.close();
        fruitBasket.carryItems();
        fruitBasket.hold();
    }
}
