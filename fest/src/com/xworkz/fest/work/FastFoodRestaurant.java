package com.xworkz.fest.work;

public class FastFoodRestaurant extends Restaurant {

    FastFoodRestaurant() {
        super();
        System.out.println("Welcome to our Fast Food Restaurant!");
    }

    public void prepareBurger() {
        System.out.println("Preparing a delicious burger");
    }

    public void serveSoftDrinks() {
        System.out.println("Serving soft drinks");
    }

    public void offerTakeaway() {
        System.out.println("Offering takeaway option");
    }

    public void provideDriveThru() {
        System.out.println("Providing drive-thru service");
    }

    public void giveDiscounts() {
        System.out.println("Offering discounts on combos");
    }
}
