package com.xworkz.information.runner;

import com.xworkz.information.internal.Pen;
import com.xworkz.information.internal.PenImp;
import com.xworkz.information.external.Notebook;

public class PenRunner {

    public static void main(String[] args) {
        Pen pen = new PenImp();
        Notebook notebook = new Notebook(pen);
        notebook.takeNotes();
    }
}
