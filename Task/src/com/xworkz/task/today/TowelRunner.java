package com.xworkz.task.today;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel = new Towel("Blue", "Large", true);
        System.out.println("Towel " + towel.toString());

        int code = towel.hashCode();
        String value="colour";
        System.out.println("White:" + towel.hashCode());
        System.out.println("White:" + value.hashCode());
    }
}