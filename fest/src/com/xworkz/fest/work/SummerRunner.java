package com.xworkz.fest.work;

public class SummerRunner {
    public static void main(String[] args) {

        Summer summer = new Hot();
        summer.increaseTemperature();
        summer.sunlight();
        summer.dehydration();
        summer.vacation();
        summer.mangoSeason();


        Hot hot = new Hot();
        hot.increaseTemperature();
        hot.sunlight();
        hot.dehydration();
        hot.vacation();
        hot.mangoSeason();
    }
}
