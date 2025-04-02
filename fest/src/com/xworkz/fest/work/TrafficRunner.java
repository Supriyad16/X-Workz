package com.xworkz.fest.work;

public class TrafficRunner {

    public static void main(String[] args) {

        Traffic traffic = new Rules();

        traffic.red();
        traffic.green();
        traffic.signals();
        traffic.yellow();
        traffic.zebra();

        Rules rules = new Rules();

        rules.fine();
        rules.follow();
        rules.police();
        rules.right();
        rules.wrong();
    }
}
