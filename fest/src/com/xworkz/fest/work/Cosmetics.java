package com.xworkz.fest.work;

class Cosmetics extends Bag {
    Cosmetics() {
        super(); // Calls the parent class constructor
        System.out.println("Cosmetics class");
    }

    public void applyMakeup() {
        System.out.println("Applying makeup from the cosmetics bag.");
    }

    public void storeLipstick() {
        System.out.println("Storing lipstick in the cosmetics bag.");
    }

    public void carryPerfume() {
        System.out.println("Carrying perfume in the cosmetics bag.");
    }

    public void organizeBrushes() {
        System.out.println("Organizing makeup brushes.");
    }

    public void checkMirror() {
        System.out.println("Checking the mirror inside the cosmetics bag.");
    }
}




