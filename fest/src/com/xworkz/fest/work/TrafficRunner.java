package com.xworkz.fest.work;

public class TrafficRunner {

    public static void main(String[] args) {

        Traffic traffic = new Rules();
        traffic.right();
        traffic.wrong();
        traffic.follow();
        traffic.fine();
        traffic.police();

        Rules rules = new Rules();
        rules.fine();
        rules.follow();
        rules.police();
        rules.right();
        rules.wrong();

    }
}
