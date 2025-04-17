package com.xworkz.external;

import com.xworkz.rules.Shelf;

public class BookShelf implements Shelf {

    @Override
    public void hold() {
        System.out.println("Holding books on the shelf");
    }

    @Override
    public void organize() {
        System.out.println("Organizing books on the shelf");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the bookshelf");
    }

    @Override
    public void arrange(){
        System.out.println("arrange the books");
    }

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.hold();
        bookShelf.organize();
        bookShelf.clean();
        bookShelf.arrange();
    }
}
