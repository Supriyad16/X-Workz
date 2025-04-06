package com.xworkz.fest.work;

public class TimeRunner {

    public static void main(String[] args) {

        Time time = new Watch();
        time.travelToPast();
        time.travelToFuture();
        time.createTimeParadox();
        time.countDown();
        time.seconds();

        Watch watch = new Watch();
        watch.travelToFuture();
        watch.travelToPast();
        watch.countDown();
        watch.createTimeParadox();
        watch.seconds();
    }
}


