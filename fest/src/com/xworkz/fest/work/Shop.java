package com.xworkz.fest.work;

public class Shop extends Vegetable {

    Shop() {
        super();
        System.out.println("Shop sells vegetables");
    }
    public void display() {

        System.out.println("Vegetables are displayed on shelves");
    }
    public void priceTag() {

        System.out.println("Each vegetable has a price tag");
    }
    public void weigh() {

        System.out.println("Vegetables are weighed before selling");
    }
    public void bill() {

        System.out.println("Customers receive a bill after purchase");
    }
    public void customerService() {

        System.out.println("Shop provides customer service");
    }
}
