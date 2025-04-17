package com.xworkz.external;

import com.xworkz.rules.Watch;

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

    @Override
    public void showDate(){
        System.out.println("smartwatch show date");
    }

    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch();
        smartWatch.showTime();
        smartWatch.setAlarm();
        smartWatch.tick();
        smartWatch.showDate();
    }
}
