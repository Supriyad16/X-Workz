package com.xworkz.fest.work;

public class SeasonRunner {
    public static void main(String[] args) {

        Season season = new Rain();
        season.weather();
        season.temperature();
        season.impactNature();
        season.bringFestivals();
        season.fruits();

        Rain rain = new Rain();
        rain.weather();
        rain.temperature();
        rain.impactNature();
        rain.bringFestivals();
        rain.fruits();
    }

}