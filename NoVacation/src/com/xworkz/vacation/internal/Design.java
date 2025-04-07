package com.xworkz.vacation.internal;

public class Design extends Black{

    public void pattern(Black black){

        black.colour();

        if(black instanceof Tile){

            Tile tile = (Tile) black;
            tile.absorbsLight();
            tile.attracts();
            tile.beauty();
            tile.build();
            tile.dark();
            tile.colour();
        }
    }
}