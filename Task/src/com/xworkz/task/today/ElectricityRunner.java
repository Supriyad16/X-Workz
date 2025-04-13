package com.xworkz.task.today;

public class ElectricityRunner {

    public static void main(String[] args) {
        Electricity electricity = new Electricity("Solar", 220, true);
        System.out.println("Electricity " + electricity.toString());

        int code = electricity.hashCode();
        String value="current";
        System.out.println("Supply:" + electricity.hashCode());
        System.out.println("Supply:" + value.hashCode());

        Electricity electricity1 = new Electricity("Water", 440, true);
        boolean equal= electricity1.equals(electricity1);
        System.out.println("equal :"+ equal);
    }
}
