package com.xworkz.vacation.internal;

public class ElectricBus extends ElectricTrain{

    public void move(Electricity electricity){

        electricity.shock();

        if(electricity instanceof ElectricTrain){

            ElectricTrain electricTrain = (ElectricTrain) electricity;
            electricTrain.generate();
            electricTrain.powerDevices();
            electricTrain.store();
            electricTrain.transmit();
            electricTrain.work();
            electricTrain.shock();

        }
    }
}
