package com.xworkz.rules;

public class SmartWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println("Showing the current time on the smartwatch");
    }

    @Override
    public void setAlarm() {
        System.out.println("Setting an alarm on the smartwatch");
    }

    @Override
    public void tick() {
        System.out.println("The smartwatch is ticking silently");
    }

    public static void main(String[] args) {
        SmartWatch watch = new SmartWatch();
        watch.showTime();
        watch.setAlarm();
        watch.tick();
    }
}
