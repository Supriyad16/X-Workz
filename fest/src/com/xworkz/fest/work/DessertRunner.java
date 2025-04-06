package com.xworkz.fest.work;

public class DessertRunner {

    public static void main(String[] args) {

        Dessert dessert = new IceCream();

        dessert.enjoy();
        dessert.ingredients();
        dessert.serve();
        dessert.store();
        dessert.taste();

        IceCream iceCream = new IceCream();

        iceCream.enjoy();
        iceCream.ingredients();
        iceCream.serve();
        iceCream.store();
        iceCream.taste();

    }
}
