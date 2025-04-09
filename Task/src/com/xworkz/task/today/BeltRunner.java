package com.xworkz.task.today;

public class BeltRunner {
    public static void main(String[] args) {
        Belt belt = new Belt("DefaultType", "DefaultBrand", true);
        System.out.println("Belt " + belt.toString());
    }
}
