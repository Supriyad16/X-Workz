package com.xworkz.fest.work;

class Sleep extends Rest {
    Sleep() {
        super();
        System.out.println("Sleep class");
    }

    @Override
    public void takeBreak() {
        System.out.println("Taking a short break.");
    }

    @Override
    public void meditate() {
        System.out.println("Meditate for relaxation.");
    }

    @Override
    public void listenToMusic() {
        System.out.println("Listen to soothing music.");
    }

    @Override
    public void drinkTea() {
        System.out.println("Drinking tea to relax.");
    }

    @Override
    public void sitQuietly() {
        System.out.println("Sit quietly and enjoying.");
    }

}