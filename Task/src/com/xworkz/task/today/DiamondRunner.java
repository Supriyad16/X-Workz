package com.xworkz.task.today;

public class DiamondRunner {
    public static void main(String[] args) {
        Diamond diamond = new Diamond(1.5, "VS1", 250000);
        System.out.println("Diamond " + diamond.toString());

        int code = diamond.hashCode();
        String value="hard";
        System.out.println("Precious:" + diamond.hashCode());
        System.out.println("Precious:" + value.hashCode());

        Diamond diamond1 = new Diamond(2.0, "FL", 1000000);
        boolean equal= diamond1.equals(diamond1);
        System.out.println("equal :"+ equal);
    }
}
