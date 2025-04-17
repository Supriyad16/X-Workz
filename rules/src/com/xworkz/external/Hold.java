package com.xworkz.external;

import com.xworkz.rules.Clip;
import com.xworkz.rules.Clock;

public class Hold implements Clip, Clock {

    @Override
    public void open() {
        System.out.println("Clipping the papers together");
    }

    @Override
    public void release() {
        System.out.println("Unclipping the papers");
    }

    @Override
    public void hold() {
        System.out.println("Holding the clip in place");
    }

    @Override
    public void tick() {
        System.out.println("Clock is ticking");
    }

    @Override
    public void alarm() {
        System.out.println("Setting the clock alarm");
    }

    @Override
    public void showTime() {
        System.out.println("Displaying the time on the clock");
    }

    public static void main(String[] args) {
        Clip clip = new Hold();
        clip.open();
        clip.release();
        clip.hold();

        Clock clock = new Hold();
        clock.tick();
        clock.alarm();
        clock.showTime();
    }
}
