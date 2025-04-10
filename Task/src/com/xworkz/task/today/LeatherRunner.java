package com.xworkz.task.today;

public class LeatherRunner {
    public static void main(String[] args) {
        Leather leather = new Leather("DefaultType", "DefaultBrand", true);
        System.out.println("Leather " + leather.toString());

        int code = leather.hashCode();
        String value="animal";
        System.out.println("Items:" + leather.hashCode());
        System.out.println("Items:" + value.hashCode());
    }
}
