package com.xworkz.task.today;

public class ChocolateRunner {

    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Dairy Milk", "Silk", 150);
        System.out.println("Chocolate " + chocolate.toString());

        int code = chocolate.hashCode();
        String value="taste";
        System.out.println("Cocoa:" + chocolate.hashCode());
        System.out.println("Cocoa:" + value.hashCode());

        Chocolate chocolate1 = new Chocolate("Milky Bar", "Strawberry", 10);
        boolean equal= chocolate1.equals(chocolate1);
        System.out.println("equal :"+ equal);
    }
}
