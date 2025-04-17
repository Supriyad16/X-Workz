package com.xworkz.external;

import com.xworkz.rules.Bag;
import com.xworkz.rules.Book;

public class Purse implements Bag, Book {

    @Override
    public void carry() {
        System.out.println("Carry the bag");

    }

    @Override
    public void hold() {
        System.out.println("Hold the bag");

    }

    @Override
    public void store() {
        System.out.println("Store the items");

    }

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

       Bag bag = new Purse();
       bag.carry();
       bag.hold();
       bag.store();

       Book book = new Purse();
       book.close();
       book.open();
       book.read();



    }

}
