package com.xworkz.fest.work;

public class NotebookRunner {
    public static void main(String[] args) {

        Notebook notebook = new Pen();
        notebook.openNotebook();
        notebook.closeNotebook();
        notebook.writeNotes();
        notebook.flipPages();
        notebook.markImportant();


        Pen pen = new Pen();
        pen.write();
        pen.refillInk();
        pen.draw();
        pen.changeColor();
        pen.capPen();
    }
}
