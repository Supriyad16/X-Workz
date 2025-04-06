package com.xworkz.fest.work;

class Poster extends Advertisement {
    Poster() {
        super();
        System.out.println("Poster class");
    }

    @Override
    public void createAd() {
        System.out.println("Creating an ads.");
    }

    @Override
    public void setTargetAudience() {
        System.out.println("Setting the target audience.");
    }

    @Override
    public void choosePlatform() {
        System.out.println("Choosing the platform for advertisement.");
    }

    @Override
    public void setBudget() {
        System.out.println("Setting the budget.");
    }

    @Override
    public void publishAd() {
        System.out.println("Publishing the advertisement through Poster.");
    }
}