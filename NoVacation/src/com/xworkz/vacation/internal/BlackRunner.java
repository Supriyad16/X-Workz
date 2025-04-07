package com.xworkz.vacation.internal;

public class BlackRunner {
    public static void main(String[] args) {

        Black black = new Tile();
        black.dark();
        black.absorbsLight();
        black.colour();
        black.beauty();
        black.attracts();

        System.out.println("----");

        Tile tile = new Tile();
        tile.dark();
        tile.absorbsLight();
        tile.colour();
        tile.beauty();
        tile.attracts();

        System.out.println("----");

        Design design = new Design();
        design.absorbsLight();
        design.attracts();
        design.beauty();
       // design.build();
        design.dark();
        design.colour();
    }
}