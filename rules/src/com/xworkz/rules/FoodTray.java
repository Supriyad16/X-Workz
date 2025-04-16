package com.xworkz.rules;

public class FoodTray implements Tray {

    @Override
    public void serve() {
        System.out.println("Serving food on the tray");
    }

    @Override
    public void holdItems() {
        System.out.println("Holding items in the food tray");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the food tray");
    }

    public static void main(String[] args) {
        FoodTray tray = new FoodTray();
        tray.serve();
        tray.holdItems();
        tray.clean();
    }
}
