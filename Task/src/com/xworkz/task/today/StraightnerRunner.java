package com.xworkz.task.today;

public class StraightnerRunner {
    public static void main(String[] args) {
        Straightner straightner = new Straightner("Ceramic", 210, "Nova");
        System.out.println("Straightner " + straightner.toString());

        int code = straightner.hashCode();
        String value="device";
        System.out.println("Straights the hair:" + straightner.hashCode());
        System.out.println("Straight the hair:" + value.hashCode());
    }
}
