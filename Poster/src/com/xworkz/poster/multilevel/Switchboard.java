package com.xworkz.poster.multilevel;

public class Switchboard extends Switch {

    public Switchboard(String brand, String type) {
        super(brand, type);
    }

    public void manageConnections() {
        System.out.println("Switchboard manages multiple switches and sockets");
    }
}
