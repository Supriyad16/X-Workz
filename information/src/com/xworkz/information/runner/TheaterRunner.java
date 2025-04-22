package com.xworkz.information.runner;

import com.xworkz.information.internal.Theater;
import com.xworkz.information.internal.TheaterImp;
import com.xworkz.information.external.Movies;

public class TheaterRunner {

    public static void main(String[] args) {
        Theater theater = new TheaterImp();
        Movies movies = new Movies(theater);
        movies.show();
    }
}
