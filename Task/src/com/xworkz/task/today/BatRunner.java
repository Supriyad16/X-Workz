package com.xworkz.task.today;

public class BatRunner {

    public static void main(String[] args) {
        Bat bat = new Bat("Willow", "SS", 4500);
        System.out.println("Bat " + bat.toString());


        int code = bat.hashCode();
        String value="strong";
        System.out.println("Wood:" + bat.hashCode());
        System.out.println("Wood:" + value.hashCode());

        Bat bat1 = new Bat("Wood", "RR", 5000);
        boolean equal= bat.equals(bat);
        System.out.println("equal :"+ equal);
    }
}
