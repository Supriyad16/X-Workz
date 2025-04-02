package com.xworkz.fest.work;

public class ProjectorRunner {

    public static void main(String[] args) {

        Projector projector = new Pannel();

        projector.adjustFocus();
        projector.changeBrightness();
        projector.powerOff();
        projector.changeBrightness();
        projector.powerOn();

        Pannel pannel = new Pannel();

        pannel.adjustVolume();
        pannel.changeSource();
        pannel.displayMenu();
        pannel.enableSmartMode();
        pannel.touchInput();


    }


}
