package com.xworkz.task.today;

public class PistachioRunner {
    public static void main(String[] args) {
        Pistachio pistachio = new Pistachio("Iranian", true, 320);
        System.out.println("Pistachio " + pistachio.toString());

        int code = pistachio.hashCode();
        String value="Salted and non-salted";
        System.out.println("Magnesium:" + pistachio.hashCode());
        System.out.println("Magnesium:" + value.hashCode());

        Pistachio pistachio1 = new Pistachio("Canadian", false, 500);
        boolean equal= pistachio1.equals(pistachio1);
        System.out.println("equal :"+ equal);
    }
}
