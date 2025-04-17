package com.xworkz.external;

import com.xworkz.rules.Tray;

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

    @Override
    public void arrange(){
        System.out.println("arrange food in tray");
    }

    public static void main(String[] args) {
        FoodTray foodTray = new FoodTray();
        foodTray.serve();
        foodTray.holdItems();
        foodTray.clean();
        foodTray.arrange();
    }
}
