package com.xworkz.task.today;

public class RayonRunner {
    public static void main(String[] args) {
        Rayon rayon = new Rayon("DefaultType", "DefaultBrand", true);
        System.out.println("Rayon " + rayon.toString());

        int code = rayon.hashCode();
        String value="material";
        System.out.println("Dresses:" + rayon.hashCode());
        System.out.println("Dresses:" + value.hashCode());
    }
}
