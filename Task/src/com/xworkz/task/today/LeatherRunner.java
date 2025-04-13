package com.xworkz.task.today;

public class LeatherRunner {
    public static void main(String[] args) {
        Leather leather = new Leather("Top grain", "Bata", true);
        System.out.println("Leather " + leather.toString());

        int code = leather.hashCode();
        String value="animal";
        System.out.println("Items:" + leather.hashCode());
        System.out.println("Items:" + value.hashCode());

        Leather leather1 = new Leather("Full Grain", "Prada", false);
        boolean equal= leather1.equals(leather1);
        System.out.println("equal :"+ equal);
    }
}
