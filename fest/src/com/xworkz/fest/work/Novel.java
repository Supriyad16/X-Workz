package com.xworkz.fest.work;

public class Novel extends Book {

    Novel() {
        super();
        System.out.println("Novel class");
    }

    @Override
    public void read() {
        System.out.println("Reading a Novel.");
    }

    @Override
    public void open() {
        System.out.println("Opening a Novel.");
    }

    @Override
    public void close() {
        System.out.println("Closing a Novel.");
    }

    @Override
    public void bookmark() {
        System.out.println("Bookmarking a Novel.");
    }

    @Override
    public void turnPage() {
        System.out.println("Turning a page of Novel.");
    }
}
