package com.xworkz.fest.work;


public class AdvertisementRunner {
    public static void main(String[] args) {

        Advertisement advertisement = new Poster();
        advertisement.createAd();
        advertisement.setTargetAudience();
        advertisement.choosePlatform();
        advertisement.setBudget();
        advertisement.publishAd();


        Poster poster = new Poster();
        poster.choosePlatform();
        poster.createAd();
        poster.setBudget();
        poster.publishAd();
        poster.setTargetAudience();
    }
}
