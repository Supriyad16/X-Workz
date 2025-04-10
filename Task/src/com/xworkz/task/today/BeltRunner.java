package com.xworkz.task.today;

public class BeltRunner {
    public static void main(String[] args) {
        Belt belt = new Belt("DefaultType", "DefaultBrand", true);
        System.out.println("Belt " + belt.toString());

        int code = belt.hashCode();
        String value="buckle";
        System.out.println("Leather:" + belt.hashCode());
        System.out.println("Leather:" + value.hashCode());
    }
}
