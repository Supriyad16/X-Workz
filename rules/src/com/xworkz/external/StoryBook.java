package com.xworkz.external;

import com.xworkz.rules.Book;

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

    @Override
    public void wrote(){
        System.out.println("wrote on  book");
    }

    public static void main(String[] args) {
        StoryBook storyBook = new StoryBook();
        storyBook.open();
        storyBook.read();
        storyBook.close();
        storyBook.wrote();

    }
}
