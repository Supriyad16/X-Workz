package com.xworkz.fest.work;

public class SmartWatch extends SmartDevice {

    SmartWatch() {
        super();
        System.out.println("Smartwatch is ready to use!");
    }

    public void trackSteps() {
        System.out.println("Tracking daily steps...");
    }

    public void measureHeartRate() {
        System.out.println("Measuring heart rate...");
    }

    public void displayNotifications() {
        System.out.println("Displaying mobile notifications...");
    }

    public void setAlarm() {
        System.out.println("Setting an alarm...");
    }

    public void trackSleep() {
        System.out.println("Tracking sleep patterns...");
    }
}
