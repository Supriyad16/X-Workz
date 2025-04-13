package com.xworkz.task.today;

public class RayonRunner {
    public static void main(String[] args) {
        Rayon rayon = new Rayon("old", "Zara", true);
        System.out.println("Rayon " + rayon.toString());

        int code = rayon.hashCode();
        String value="material";
        System.out.println("Dresses:" + rayon.hashCode());
        System.out.println("Dresses:" + value.hashCode());

        Rayon rayon1 = new Rayon("", "Reymonds", false);
        boolean equal= rayon1.equals(rayon1);
        System.out.println("equal :"+ equal);
    }
}
