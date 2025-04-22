package com.xworkz.information.runner;

import com.xworkz.information.internal.Brush;
import com.xworkz.information.internal.BrushImp;
import com.xworkz.information.external.Painting;

public class BrushRunner {

    public static void main(String[] args) {
        Brush brush = new BrushImp();
        Painting painting = new Painting(brush);
        painting.startArt();
    }
}
