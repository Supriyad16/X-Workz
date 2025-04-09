package com.xworkz.task.today;

public class ElectricityRunner {

    public static void main(String[] args) {
        Electricity electricity = new Electricity("Solar", 220, true);
        System.out.println("Electricity " + electricity.toString());
    }
}
