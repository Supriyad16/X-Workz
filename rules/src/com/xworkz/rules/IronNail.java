package com.xworkz.rules;

public class IronNail implements Nail {

    @Override
    public void hammer() {
        System.out.println("Hammering the iron nail");
    }

    @Override
    public void pull() {
        System.out.println("Pulling out the iron nail");
    }

    @Override
    public void rust() {
        System.out.println("Iron nail rusting over time");
    }

    public static void main(String[] args) {
        IronNail nail = new IronNail();
        nail.hammer();
        nail.pull();
        nail.rust();
    }
}
