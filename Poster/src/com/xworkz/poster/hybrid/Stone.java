package com.xworkz.poster.hybrid;

public class Stone extends Pebble {
    public void breakDown() {
        System.out.println("Stone is breaking down.");
    }

    public static void main(String[] args) {
        Stone s = new Stone();
        s.smash();
        s.roll();
        s.breakDown();

        Sand sand = new Sand();
        sand.smash();
        sand.flow();
    }
}
