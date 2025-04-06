package com.xworkz.fest.work;

public class SmartDeviceRunner {

    public static void main(String[] args) {

        SmartDevice device = new SmartWatch();
        device.trackSleep();
        device.measureHeartRate();
        device.displayNotifications();
        device.setAlarm();
        device.trackSleep();


        SmartWatch watch = new SmartWatch();
        watch.trackSteps();
        watch.measureHeartRate();
        watch.displayNotifications();
        watch.setAlarm();
        watch.trackSleep();
    }
}
