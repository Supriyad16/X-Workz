package com.xworkz.fest.work;


public class IceCream extends Dessert {

    IceCream() {
        super();
        System.out.println("Ice Cream is a frozen dessert");
    }

    @Override
    public void taste() {

        System.out.println("IceCream's are usually sweet");
    }

    @Override
    public void ingredients() {

        System.out.println("IceCream are made with sugar, flour, and dairy");
    }

    @Override
    public void serve() {

        System.out.println("IceCream are served after meals");
    }

    @Override
    public void store() {

        System.out.println("IceCream should be stored properly");
    }

    @Override
    public void enjoy() {

        System.out.println("Everyone enjoys IceCream");
    }
}