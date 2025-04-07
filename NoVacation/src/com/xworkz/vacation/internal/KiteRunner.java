package com.xworkz.vacation.internal;

public class KiteRunner {
    public static void main(String[] args) {

        Kite kite = new Paper();
        kite.fly();
        kite.shapes();
        kite.string();
        kite.festivals();
        kite.lightMaterial();

        Paper paper = new Paper();
        paper.festivals();
        paper.shapes();
        paper.string();
        paper.fly();
        paper.lightMaterial();

        Thread thread = new Thread();
        thread.festivals();
        thread.shapes();
        thread.string();
        thread.fly();
        thread.lightMaterial();
    }
}
