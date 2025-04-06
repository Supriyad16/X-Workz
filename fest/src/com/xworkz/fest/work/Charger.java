package com.xworkz.fest.work;

class Charger extends Mobile {
    Charger() {
        super();
        System.out.println("Charger class");
    }

    @Override
    public void makeCall() {
        System.out.println("Charger is needed to Making a phone call.");
    }

    @Override
    public void sendText() {
        System.out.println("Charger is needed to Sending a text message.");
    }

    @Override
    public void browse() {
        System.out.println("Charger is needed to Browsing the internet.");
    }

    @Override
    public void apps() {
        System.out.println("Charger is needed to taking a photo with the mobile camera.");
    }

    @Override
    public void playMusic() {
        System.out.println("Charger is needed to Playing music on the mobile.");
    }
}