package com.xworkz.vacation.internal;

public class Popular extends Poster{

    public void celebrity(Advertisement advertisement){

        advertisement.createAd();

        if(advertisement instanceof Poster){

            Poster poster = (Poster) advertisement;
            poster.choosePlatform();
            poster.famous();
            poster.createAd();
            poster.publishAd();
            poster.setBudget();
            poster.setTargetAudience();
        }
    }
}
