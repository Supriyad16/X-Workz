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
        poster.designPoster();
        poster.selectColors();
        poster.addText();
        poster.printPoster();
        poster.displayPoster();
    }
}
