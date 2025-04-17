package com.xworkz.external;

import com.xworkz.rules.File;

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

    @Override
    public void edit(){
        System.out.println("edit text file");
    }

    public static void main(String[] args) {
        TextFile textFile = new TextFile();
        textFile.open();
        textFile.read();
        textFile.close();
        textFile.edit();
    }
}
