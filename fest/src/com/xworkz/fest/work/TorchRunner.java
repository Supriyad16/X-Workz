package com.xworkz.fest.work;

public class TorchRunner {
    public static void main(String[] args) {


        Torch torch = new Light();
        torch.turnOn();
        torch.turnOff();
        torch.adjustBrightness();
        torch.portable();
        torch.batteryOperated();




        Light light = new Light();
        light.illuminate();
        light.differentColors();
        light.usedInDecorations();
        light.requiresElectricity();
        light.enhancesVisibility();
    }
}