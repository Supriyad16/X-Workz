package com.xworkz.rules;

public class TextFile implements File {

    @Override
    public void open() {
        System.out.println("Opening the text file");
    }

    @Override
    public void read() {
        System.out.println("Reading the text file");
    }

    @Override
    public void close() {
        System.out.println("Closing the text file");
    }

    public static void main(String[] args) {
        TextFile file = new TextFile();
        file.open();
        file.read();
        file.close();
    }
}
