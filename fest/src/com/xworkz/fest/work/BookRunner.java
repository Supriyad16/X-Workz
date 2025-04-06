package com.xworkz.fest.work;

public class BookRunner {
    public static void main(String[] args) {

        Book book = new Novel();
        book.read();
        book.open();
        book.close();
        book.bookmark();
        book.turnPage();

        Novel novel = new Novel();
        novel.read();
        novel.open();
        novel.close();
        novel.bookmark();
        novel.turnPage();
    }

}
