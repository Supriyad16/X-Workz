package com.xworkz.task.today;

public class SpoonRunner {
    public static void main(String[] args) {
        Spoon spoon = new Spoon("Medium", "Steel", false);
        System.out.println("Spoon " + spoon.toString());

        int code = spoon.hashCode();
        String value="vessels";
        System.out.println("Eat:" + spoon.hashCode());
        System.out.println("Eat:" + value.hashCode());
    }
}
