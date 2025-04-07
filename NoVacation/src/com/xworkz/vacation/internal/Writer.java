package com.xworkz.vacation.internal;

public class Writer extends Novel{

    public void fictional(Book book){

        book.read();

        if(book instanceof Novel){

            Novel novel = (Novel) book;
            novel.turnPage();
            novel.bookmark();
            novel.close();
            novel.open();
            novel.write();
            novel.read();
        }

    }
}
