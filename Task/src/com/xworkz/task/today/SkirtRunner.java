package com.xworkz.task.today;

public class SkirtRunner {

    public static void main(String[] args) {
        Skirt skirt = new Skirt("Medium", "Pink", 1200);
        System.out.println("Skirt " + skirt.toString());

        int code = skirt.hashCode();
        String value="long";
        System.out.println("Uniform:" + skirt.hashCode());
        System.out.println("Uniform:" + value.hashCode());

        Skirt skirt1 = new Skirt("Large", "Red", 850);
        boolean equal= skirt1.equals(skirt1);
        System.out.println("equal :"+ equal);
    }
}
