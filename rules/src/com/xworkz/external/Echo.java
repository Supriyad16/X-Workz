package com.xworkz.external;

import com.xworkz.rules.Bell;
import com.xworkz.rules.Bench;

public class Echo implements Bell, Bench {

    @Override
    public void ring() {
        System.out.println("Ringing the school bell");
    }

    @Override
    public void hang() {
        System.out.println("Hanging the school bell");
    }

    @Override
    public void sound() {
        System.out.println("Bell makes a loud sound");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on the park bench");
    }

    @Override
    public void move() {
        System.out.println("Bench gives back support");
    }

    @Override
    public void clean() {
        System.out.println("Painting the wooden bench");
    }

    public static void main(String[] args) {
        Bell bell = new Echo();
        bell.ring();
        bell.hang();
        bell.sound();

        Bench bench = new Echo();
        bench.sit();
        bench.move();
        bench.clean();
    }
}
