package com.xworkz.realworld.examples;

public class Novels extends Book{

    public Novels(String name, String author, String publication, int year){
        super(name, author, publication, year);
    }

    public static void main(String[] args) {
        Book book = new Novels("One Indian Girl", "Chethan Bhagath", "Rupa Publication", 2016);
        System.out.println("The Novel named " + book.name + " written by " +book.author + " was published in "+ book.year + " by the publisher " + book.publication);
    }
}
