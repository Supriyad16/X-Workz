package com.xworkz.task.today;

public class GlassRunner {
    public static void main(String[] args) {
        Glass glass = new Glass("Juice", 250, true);
        System.out.println("Glass " + glass.toString());

        int code = glass.hashCode();
        String value="break";
        System.out.println("Vase:" + glass.hashCode());
        System.out.println("Vase:" + value.hashCode());
    }
}
