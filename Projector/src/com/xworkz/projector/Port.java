package com.xworkz.projector;

public class Port {

    private String type;
    private int noOfPorts;

    Port(String type, int noOfPorts) {
        this.type = type;
        this.noOfPorts = noOfPorts;
    }

    void showPortDetails() {
        System.out.println("Port Type: " + type + ", Version: " + noOfPorts);
    }
}

