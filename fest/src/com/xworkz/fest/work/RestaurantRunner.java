package com.xworkz.fest.work;

public class RestaurantRunner {
    public static void main(String[] args) {

        Restaurant restaurant = new FastFoodRestaurant();
        restaurant.serveFood();
        restaurant.takeOrder();
        restaurant.acceptPayment();
        restaurant.cleanTables();
        restaurant.provideMenu();



        FastFoodRestaurant fastFood = new FastFoodRestaurant();
        fastFood.prepareBurger();
        fastFood.serveSoftDrinks();
        fastFood.offerTakeaway();
        fastFood.provideDriveThru();
        fastFood.giveDiscounts();
    }
}
