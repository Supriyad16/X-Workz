package com.xworkz.fest.work;

public class RestaurantRunner {
    public static void main(String[] args) {

        Restaurant restaurant = new FastFoodRestaurant();
        restaurant.serveFood();
        restaurant.takeOrder();
        restaurant.payment();
        restaurant.cleanTables();
        restaurant.menu();


        FastFoodRestaurant fastFood = new FastFoodRestaurant();
        fastFood.serveFood();
        fastFood.takeOrder();
        fastFood.payment();
        fastFood.cleanTables();
        fastFood.menu();
    }
}
