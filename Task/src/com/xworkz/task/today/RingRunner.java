package com.xworkz.task.today;

public class RingRunner {
    public static void main(String[] args) {
        Ring ring = new Ring("Gold", 6.5, true);
        System.out.println("Ring " + ring.toString());

        int code = ring.hashCode();
        String value="size";
        System.out.println("Wedding:" + ring.hashCode());
        System.out.println("Wedding:" + value.hashCode());
    }
}
