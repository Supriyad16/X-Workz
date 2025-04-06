package com.xworkz.fest.work;

public class ProjectorRunner {

    public static void main(String[] args) {

        Projector projector = new Pannel();
        projector.focus();
        projector.brightness();
        projector.powerOff();
        projector.displayResolution();
        projector.powerOn();

        Pannel pannel = new Pannel();
        pannel.focus();
        pannel.brightness();
        pannel.powerOff();
        pannel.displayResolution();
        pannel.powerOff();

    }
}
