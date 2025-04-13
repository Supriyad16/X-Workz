package com.xworkz.task.today;

import javafx.geometry.HPos;

public class HoodieRunner {
    public static void main(String[] args) {
        Hoodie hoodie = new Hoodie("Withcap", "Zudio", true);
        System.out.println("Hoodie " + hoodie.toString());

        int code = hoodie.hashCode();
        String value="cap";
        System.out.println("T-Shirt:" + hoodie.hashCode());
        System.out.println("T-Shirt:" + value.hashCode());

        Hoodie hoodie1 = new Hoodie("WithoutCpr", "Trends", false);
        boolean equal= hoodie1.equals(hoodie1);
        System.out.println("equal :"+ equal);
    }
}
