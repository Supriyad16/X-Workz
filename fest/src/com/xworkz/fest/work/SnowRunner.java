package com.xworkz.fest.work;

public class SnowRunner {
    public static void main(String[] args) {

        Snow snow = new Penguin();
        snow.coldWeather();
        snow.mountains();
        snow.melts();
        snow.usedForSports();
        snow.reflectsSunlight();


        Penguin penguin = new Penguin();
        penguin.coldWeather();
        penguin.melts();
        penguin.mountains();
        penguin.usedForSports();
        penguin.reflectsSunlight();
    }
}
