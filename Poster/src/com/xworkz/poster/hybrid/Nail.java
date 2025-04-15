package com.xworkz.poster.hybrid;

public class Nail extends Rod {
    public void fix() {
        System.out.println("Nail fixes objects.");
    }

    public static void main(String[] args) {
        Nail nail = new Nail();
        nail.rust();
        nail.support();
        nail.fix();

        Sheet sheet = new Sheet();
        sheet.rust();
        sheet.cover();
    }
}
