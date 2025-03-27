package com.xworkz.projector;

public class Board {

   private String model;
   private int capacitor;

    Board(String model, int capacitor) {
        this.model = model;
        this.capacitor = capacitor;
    }

    void showBoardInfo() {
        System.out.println("Board Model: " + model + ", Manufacturer: " + capacitor);
    }
}

