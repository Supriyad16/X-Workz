package com.xworkz.fest.work;

public class SmartDeviceRunner {

    public static void main(String[] args) {

        SmartDevice device = new SmartWatch();
        device.powerOn();
        device.connectToWiFi();
        device.updateSoftware();
        device.showBatteryStatus();
        device.powerOff();



        SmartWatch watch = new SmartWatch();
        watch.trackSteps();
        watch.measureHeartRate();
        watch.displayNotifications();
        watch.setAlarm();
        watch.trackSleep();
    }
}
