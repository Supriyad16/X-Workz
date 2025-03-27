package com.xworkz.projector;

public class Remote {

    private int cost;
    private String battery;

    Remote(int cost, String battery) {
        this.cost = cost;
        this.battery = battery;
    }

    void useRemote() {
        System.out.println("Using remote from " + cost);
    }
}

