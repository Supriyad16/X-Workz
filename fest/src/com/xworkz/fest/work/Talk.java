package com.xworkz.fest.work;

class Talk extends Timepass {
    Talk() {
        super();
        System.out.println("Talk class");
    }

    @Override
    public void watchTV() {
        System.out.println("Watching TV.");
    }

    @Override
    public void playGames() {
        System.out.println("Playing mobile or video games.");
    }

    @Override
    public void scrollSocialMedia() {
        System.out.println("Scrolling through social media.");
    }

    @Override
    public void listenToMusic() {
        System.out.println("Listening to music.");
    }

    @Override
    public void readRandomStuff() {
        System.out.println("Reading Novels.");
    }
}