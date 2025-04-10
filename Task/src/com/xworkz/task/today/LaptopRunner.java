package com.xworkz.task.today;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 16, 65000);
        System.out.println("Laptop " + laptop.toString());

        int code = laptop.hashCode();
        String value="watch";
        System.out.println("Display:" + laptop.hashCode());
        System.out.println("Display:" + value.hashCode());
    }
}
