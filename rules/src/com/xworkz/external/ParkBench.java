package com.xworkz.external;

import com.xworkz.rules.Bench;

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

    @Override
    public void write(){
        System.out.println("Sleep on the bench");
    }

    public static void main(String[] args) {
        ParkBench parkBench = new ParkBench();
        parkBench.sit();
        parkBench.move();
        parkBench.clean();
        parkBench.write();
    }
}
