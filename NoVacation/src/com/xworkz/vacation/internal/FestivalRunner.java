package com.xworkz.vacation.internal;

public class FestivalRunner {

    public static void main(String[] args) {

        Festival festival = new Joy();
        festival.clothes();
        festival.food();
        festival.happy();
        festival.share();
        festival.sweets();

        Joy joy = new Joy();
        joy.clothes();
        joy.food();
        joy.happy();
        joy.share();
        joy.sweets();

        Enjoyment enjoyment = new Enjoyment();
        enjoyment.clothes();
        enjoyment.food();
        enjoyment.happy();
        enjoyment.play();
        enjoyment.sweets();
        enjoyment.share();
    }
}