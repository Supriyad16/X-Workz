package com.xworkz.rules;

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

    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();
        shelf.hold();
        shelf.organize();
        shelf.clean();
    }
}
