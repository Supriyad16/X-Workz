package com.xworkz.poster.singlelevel;

public class Movie {
    String name;
    String genre;

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public void play() {
        System.out.println("Movie is playing on the screen");
    }
}
