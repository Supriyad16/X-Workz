package com.xworkz.rules;

public class Reflect implements Nail, Mirror {

    @Override
    public void hammer() {
        System.out.println("Hammering the nail into the wall");
    }

    @Override
    public void rust() {
        System.out.println("Fixing the nail into the surface");
    }

    @Override
    public void pull() {
        System.out.println("Removing the nail from the surface");
    }

    @Override
    public void reflect() {
        System.out.println("Reflecting light in the mirror");
    }

    @Override
    public void hang() {
        System.out.println("Polishing the mirror");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the mirror");
    }

    public static void main(String[] args) {
        Nail nail = new Reflect();
        nail.hammer();
        nail.rust();
        nail.pull();

        Mirror mirror = new Reflect();
        mirror.reflect();
        mirror.hang();
        mirror.clean();
    }
}
