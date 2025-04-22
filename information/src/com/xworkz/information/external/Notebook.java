package com.xworkz.information.external;

import com.xworkz.information.internal.Pen;

public class Notebook {

    private Pen pen;

    public Notebook(Pen pen) {
        this.pen = pen;
        System.out.println("Arg constructor of Notebook");
    }

    public void takeNotes() {
        System.out.println("Taking notes...");
        if (this.pen != null) {
            this.pen.write();
        } else {
            System.out.println("Pen is null");
        }
    }
}
