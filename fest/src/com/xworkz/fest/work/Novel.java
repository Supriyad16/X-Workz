package com.xworkz.fest.work;

public class Novel extends Book {

    Novel() {
        super();
        System.out.println("Novel class");
    }

    public void genre() {
        System.out.println("Novel has different genres");
    }

    public void author() {
        System.out.println("Novel has an author");
    }

    public void storyline() {
        System.out.println("Novel has a storyline");
    }

    public void characters() {
        System.out.println("Novel has many characters");
    }

    public void chapters() {
        System.out.println("Novel is divided into chapters");
    }
}
