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

        wire.ensureDurability();
        wire.flexibleUsage();
        wire.secureConnection();
        wire.shieldNoise();
        wire.transmitSignal();

    }
}
