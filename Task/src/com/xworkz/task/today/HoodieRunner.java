package com.xworkz.task.today;

public class HoodieRunner {
    public static void main(String[] args) {
        Hoodie hoodie = new Hoodie("DefaultType", "DefaultBrand", true);
        System.out.println("Hoodie " + hoodie.toString());
    }
}
