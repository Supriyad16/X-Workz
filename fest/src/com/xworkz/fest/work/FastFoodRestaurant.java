package com.xworkz.fest.work;

public class FastFoodRestaurant extends Restaurant {

    FastFoodRestaurant() {
        super();
        System.out.println("Welcome to our Fast Food Restaurant!");
    }

    public void serveFood() {
        System.out.println("Serves junk food.");
    }

    public void takeOrder() {
        System.out.println("FastFoodRestaurant are self service.");
    }

    public void payment() {
        System.out.println("Accepts the payment.");
    }

    public void cleanTables() {
        System.out.println("Cleans the table.");
    }

    public void menu() {
        System.out.println("They hve variety of menu");
    }
}
