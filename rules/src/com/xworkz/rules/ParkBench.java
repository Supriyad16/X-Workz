package com.xworkz.rules;

public class ParkBench implements Bench {

    @Override
    public void sit() {
        System.out.println("Sitting on the park bench");
    }

    @Override
    public void move() {
        System.out.println("Moving the park bench");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the park bench");
    }

    public static void main(String[] args) {
        ParkBench bench = new ParkBench();
        bench.sit();
        bench.move();
        bench.clean();
    }
}
