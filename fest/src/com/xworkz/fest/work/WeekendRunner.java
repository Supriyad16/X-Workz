package com.xworkz.fest.work;

public class WeekendRunner {
    public static void main(String[] args) {

        Weekend weekend = new Movies();
        weekend.relax();
        weekend.goOut();
        weekend.sleepMore();
        weekend.playSports();
        weekend.readBook();


        Movies movies = new Movies();
        movies.relax();
        movies.goOut();
        movies.sleepMore();
        movies.playSports();
        movies.relax();
    }
}