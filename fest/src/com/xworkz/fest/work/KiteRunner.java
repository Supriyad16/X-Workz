package com.xworkz.fest.work;

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
    }
}
