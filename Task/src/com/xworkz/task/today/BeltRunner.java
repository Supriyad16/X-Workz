package com.xworkz.task.today;

public class BeltRunner {
    public static void main(String[] args) {
        Belt belt = new Belt("Rubber", "Levis", true);
        System.out.println("Belt " + belt.toString());

        int code = belt.hashCode();
        String value="buckle";
        System.out.println("Leather:" + belt.hashCode());
        System.out.println("Leather:" + value.hashCode());

        Belt belt1 = new Belt("Leather", "Woodland", true);
        boolean equal= belt1.equals(belt1);
        System.out.println("equal :"+ equal);
    }
}
