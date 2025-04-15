package com.xworkz.realworld.examples;

public abstract class Book {

    String name;
    String author;
    String publication;
    int year;

    Book(String name){
        this.name=name;

    }

    Book(String name,String author, String publication ){
        this(name);
        this.author=author;
        this.publication=publication;

    }
    Book(String name, String author, String publication, int year){
        this(name, author, publication);
        this.year=year;
    }
}

// An abstract class with four variables and declare three constructors, with out no-arg constructor
