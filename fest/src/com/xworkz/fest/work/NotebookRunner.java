package com.xworkz.fest.work;

public class NotebookRunner {
    public static void main(String[] args) {

        Notebook notebook = new Pen();
        notebook.open();
        notebook.close();
        notebook.write();
        notebook.flipPages();
        notebook.markImportant();


        Pen pen = new Pen();
        pen.write();
        pen.open();
        pen.close();
        pen.flipPages();
        pen.markImportant();
    }
}
