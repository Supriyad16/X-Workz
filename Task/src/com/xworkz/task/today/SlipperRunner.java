package com.xworkz.task.today;

public class SlipperRunner {
    public static void main(String[] args) {
        Slipper slipper = new Slipper("Flip flop", "Nike", true);
        System.out.println("Slipper " + slipper.toString());

        int code = slipper.hashCode();
        String value="cheap";
        System.out.println("Daily Wear:" + slipper.hashCode());
        System.out.println("Daily Wear:" + value.hashCode());

        Slipper slipper1 = new Slipper("Belt", "Walkmate", true);
        boolean equal= slipper1.equals(slipper1);
        System.out.println("equal :"+ equal);
    }
}
