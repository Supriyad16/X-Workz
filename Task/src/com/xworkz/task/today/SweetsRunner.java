package com.xworkz.task.today;

public class SweetsRunner {
    public static void main(String[] args) {
        Sweets sweet = new Sweets("Kaju Katli", 250, false);
        System.out.println("Sweets " + sweet.toString());

        int code = sweet.hashCode();
        String value="melts";
        System.out.println("Melts:" + sweet.hashCode());
        System.out.println("Melts:" + value.hashCode());
    }
}
