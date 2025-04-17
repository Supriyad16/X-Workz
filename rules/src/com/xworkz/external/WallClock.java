package com.xworkz.external;

import com.xworkz.rules.Clock;

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
    public void setTime(){
        System.out.println("Set time ");
    }

    public static void main(String[] args) {
        WallClock wallClock = new WallClock();
        wallClock.showTime();
        wallClock.tick();
        wallClock.alarm();
        wallClock.setTime();
    }
}
