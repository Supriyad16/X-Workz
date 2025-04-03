package com.xworkz.fest.work;

public class SeasonRunner {
    public static void main(String[] args) {

        Season season = new Rain();
        season.changeWeather();
        season.affectTemperature();
        season.impactNature();
        season.bringFestivals();
        season.influenceLifestyle();


        Rain rain = new Rain();
        rain.pourWater();
        rain.coolTheAir();
        rain.nourishPlants();
        rain.createRivers();
        rain.bringRainbows();
    }
}