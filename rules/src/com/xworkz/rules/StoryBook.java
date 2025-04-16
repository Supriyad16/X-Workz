package com.xworkz.rules;

public class StoryBook implements Book {

    @Override
    public void open() {
        System.out.println("Opening the story book");
    }

    @Override
    public void read() {
        System.out.println("Reading the story book");
    }

    @Override
    public void close() {
        System.out.println("Closing the story book");
    }

    public static void main(String[] args) {
        StoryBook book = new StoryBook();
        book.open();
        book.read();
        book.close();
    }
}
