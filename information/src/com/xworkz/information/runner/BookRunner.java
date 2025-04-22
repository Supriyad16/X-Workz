package com.xworkz.information.runner;

import com.xworkz.information.internal.Book;
import com.xworkz.information.internal.BookImp;
import com.xworkz.information.external.Novels;

public class BookRunner {

    public static void main(String[] args) {
        Book book = new BookImp();
        Novels novels = new Novels(book);
        novels.startReading();
    }
}
