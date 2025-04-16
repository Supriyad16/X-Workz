package com.xworkz.rules;

public class WallClock implements Clock {

    @Override
    public void showTime() {
        System.out.println("Showing time on the wall clock");
    }

    @Override
    public void tick() {
        System.out.println("Ticking sound of the wall clock");
    }

    @Override
    public void alarm() {
        System.out.println("Wall clock alarm ringing");
    }

    public static void main(String[] args) {
        WallClock clock = new WallClock();
        clock.showTime();
        clock.tick();
        clock.alarm();
    }
}
