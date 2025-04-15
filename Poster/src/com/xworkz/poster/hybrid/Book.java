package com.xworkz.poster.hybrid;

public class Book extends Cover {
    public void open() {
        System.out.println("Book is opened.");
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.turn();
        book.protect();
        book.open();

        Text text = new Text();
        text.turn();
        text.read();
    }
}
