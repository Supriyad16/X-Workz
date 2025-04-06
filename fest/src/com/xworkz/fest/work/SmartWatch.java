package com.xworkz.fest.work;

public class SmartWatch extends SmartDevice {

    SmartWatch() {
        super();
        System.out.println("Smartwatch is ready to use!");
    }

    @Override
    public void trackSteps() {
        System.out.println("Tracking daily steps.");
    }

    @Override
    public void measureHeartRate() {
        System.out.println("Measuring heart rate.");
    }

    @Override
    public void displayNotifications() {
        System.out.println("Displaying mobile notifications.");
    }

    @Override
    public void setAlarm() {
        System.out.println("Setting an alarm.");
    }

    @Override
    public void trackSleep() {
        System.out.println("Tracking sleep patterns.");

    }
}
