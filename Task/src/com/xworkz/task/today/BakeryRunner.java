package com.xworkz.task.today;

public class BakeryRunner {
    public static void main(String[] args) {
        Bakery bakery = new Bakery("Sweet Treats", "MG Road", 1999);
        System.out.println("Bakery " + bakery.toString());


        int code = bakery.hashCode();
        String value="sweets";
        System.out.println("Items:" + bakery.hashCode());
        System.out.println("Items:" + value.hashCode());
    }
}
