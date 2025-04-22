package com.xworkz.information.external;

import com.xworkz.information.internal.Book;

public class Novels {

    private Book book;

    public Novels(Book book) {
        this.book = book;
        System.out.println("Arg constructor of Novels");
    }

    public void startReading() {
        System.out.println("startReading in Novels");
        if (this.book != null) {
            this.book.read();
        } else {
            System.out.println("Book is null");
        }
    }
}
