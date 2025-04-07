package com.xworkz.vacation.internal;

public class AdvertisementRunner {
    public static void main(String[] args) {

        Advertisement advertisement = new Poster();
        advertisement.createAd();
        advertisement.setTargetAudience();
        advertisement.choosePlatform();
        advertisement.setBudget();
        advertisement.publishAd();

        System.out.println("----");

        Poster poster = new Poster();
        poster.choosePlatform();
        poster.createAd();
        poster.setBudget();
        poster.publishAd();
        poster.setTargetAudience();

        System.out.println("----");

        Popular popular = new Popular();
        popular.choosePlatform();
        popular.famous();
        popular.createAd();
        popular.publishAd();
        popular.setBudget();
        popular.setTargetAudience();
    }
}