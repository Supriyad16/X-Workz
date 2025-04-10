package com.xworkz.task.today;

public class DiamondRunner {
    public static void main(String[] args) {
        Diamond diamond = new Diamond(1.5, "VS1", 250000);
        System.out.println("Diamond " + diamond.toString());

        int code = diamond.hashCode();
        String value="hard";
        System.out.println("Precious:" + diamond.hashCode());
        System.out.println("Precious:" + value.hashCode());
    }
}
