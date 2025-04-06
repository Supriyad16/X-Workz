package com.xworkz.fest.work;

public class PortRunner {

    public static void main(String[] args) {

        Port port = new Wire();
        port.checkStatus();
        port.connect();
        port.disconnect();
        port.powerSupply();
        port.transferData();

        Wire wire = new Wire();
        wire.connect();
        wire.checkStatus();
        wire.disconnect();
        wire.powerSupply();
        wire.transferData();

    }
}
