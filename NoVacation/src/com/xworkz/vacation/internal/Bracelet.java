package com.xworkz.vacation.internal;

class Bracelet extends Hand {
    Bracelet() {
        super();
        System.out.println("Bracelet class");
    }

    @Override
    public void wear() {
        System.out.println("Bracelet is worn on the wrist.");
    }

    @Override
    public void style() {
        System.out.println("Bracelet enhances style.");
    }

    @Override
    public void materials() {
        System.out.println("Bracelets are made of gold or beads.");
    }

    @Override
    public void gift() {
        System.out.println("Bracelets are often gifted as jewelry.");
    }

    @Override
    public void designs() {
        System.out.println("Bracelets come in various designs.");
    }
}
