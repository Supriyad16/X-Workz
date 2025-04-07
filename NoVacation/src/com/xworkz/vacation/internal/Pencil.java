package com.xworkz.vacation.internal;

public class Pencil extends Pen{

    public  void draw(Notebook notebook){

        notebook.flipPages();

        if(notebook instanceof Pen){

            Pen pen = (Pen) notebook;
            pen.close();
            pen.markImportant();
            pen.open();
            pen.flipPages();
            pen.read();
            pen.write();
        }
    }
}
