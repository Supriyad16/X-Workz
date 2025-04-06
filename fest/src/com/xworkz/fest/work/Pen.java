package com.xworkz.fest.work;

class Pen extends Notebook {
    Pen() {
        super();
        System.out.println("Pen class");
    }

    @Override
    public void open() {
        System.out.println("Open the notebook.");
    }

    @Override
    public void close() {
        System.out.println("Close the notebook.");
    }

    @Override
    public void write() {
        System.out.println("Write notes .");
    }

    @Override
    public void flipPages() {
        System.out.println("Flip the pages.");
    }

    @Override
    public void markImportant() {
        System.out.println("Mark important in the notebook.");
    }

}