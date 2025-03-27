package com.xworkz.projector;

public class Panel {

    private int noOfPannel;
    private String material;

    Panel(int noOfPannel, String material) {
        this.noOfPannel = noOfPannel;
        this.material = material;
    }

    void showPanelDetails() {
        System.out.println("Panel with " + noOfPannel + " buttons made of " + material);
    }
}

