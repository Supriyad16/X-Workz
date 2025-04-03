package com.xworkz.fest.work;

public class RestRunner {
    public static void main(String[] args) {

        Rest rest = new Sleep();
        rest.takeBreak();
        rest.meditate();
        rest.listenToMusic();
        rest.drinkTea();
        rest.sitQuietly();


        Sleep sleep = new Sleep();
        sleep.deepSleep();
        sleep.dream();
        sleep.snore();
        sleep.nap();
        sleep.wakeUpFresh();
    }
}
