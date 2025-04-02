package com.xworkz.fest.work;

public class VegetableRunner {

    public static void main(String[] args) {

        Vegetable vegetable = new Shop();

        vegetable.cook();
        vegetable.grow();
        vegetable.harvest();
        vegetable.nutrients();
        vegetable.sell();

        Shop shop = new Shop();

        shop.bill();
        shop.customerService();
        shop.display();
        shop.priceTag();
        shop.weigh();
    }
}
