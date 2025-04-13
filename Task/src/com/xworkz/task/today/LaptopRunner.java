package com.xworkz.task.today;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 8, 65000);
        System.out.println("Laptop " + laptop.toString());

        int code = laptop.hashCode();
        String value="watch";
        System.out.println("Display:" + laptop.hashCode());
        System.out.println("Display:" + value.hashCode());

        Laptop laptop1 = new Laptop("Victus", 16, 80000 );
        boolean equal= laptop1.equals(laptop1);
        System.out.println("equal :"+ equal);
    }
}
