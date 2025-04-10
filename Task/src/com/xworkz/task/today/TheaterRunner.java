package com.xworkz.task.today;

public class TheaterRunner {

    public static void main(String[] args) {
        Theater theater = new Theater("Inox", 200, "Bangalore");
        System.out.println("Theater " + theater.toString());

        int code = theater.hashCode();
        String value="film";
        System.out.println("Movies:" + theater.hashCode());
        System.out.println("Movies:" + value.hashCode());
    }
}
