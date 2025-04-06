package com.xworkz.fest.work;

class Culture extends Japanese {
    Culture() {
        super();
        System.out.println("Culture class");
    }

    @Override
    public void uniqueLanguage() {
        System.out.println("The Japanese language have unique language.");
    }

    @Override
    public void advancedTechnology() {
        System.out.println("Japanese have technology and innovation.");
    }

    @Override
    public void richHistory() {
        System.out.println("Japan have a rich history .");
    }

    @Override
    public void beautifulLandscapes() {
        System.out.println("Japan is home to beautiful landscapes.");
    }

    @Override
    public void famousCuisine() {
        System.out.println("Japanese cuisine includes traditional dishes.");
    }
}