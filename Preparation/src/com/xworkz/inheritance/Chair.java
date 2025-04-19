package com.xworkz.inheritance;

public class Chair implements Bench{
    @Override
    public void sit() {
        System.out.println("sdfghj");
    }

    @Override
    public void clean() {
        System.out.println("zxcvbnm,");
    }
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.sit();
        chair.clean();
    }
}