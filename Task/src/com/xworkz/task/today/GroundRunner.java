package com.xworkz.task.today;

public class GroundRunner {
    public static void main(String[] args) {
        Ground ground = new Ground("Playground", "Sports", 4500.5);
        System.out.println("Ground " + ground.toString());

        int code = ground.hashCode();
        String value="soil";
        System.out.println("Field:" + ground.hashCode());
        System.out.println("Field:" + value.hashCode());
    }
}
