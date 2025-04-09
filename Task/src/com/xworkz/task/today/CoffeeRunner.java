package com.xworkz.task.today;

public class CoffeeRunner {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Cappuccino", true, 2);
        System.out.println("Coffee " + coffee.toString());
    }
}
