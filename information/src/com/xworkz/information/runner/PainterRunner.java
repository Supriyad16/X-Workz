package com.xworkz.information.runner;

import com.xworkz.information.internal.Painter;
import com.xworkz.information.internal.PainterImp;
import com.xworkz.information.external.Canvas;

public class PainterRunner {

    public static void main(String[] args) {
        Painter painter = new PainterImp();
        Canvas canvas = new Canvas(painter);
        canvas.startPainting();
    }
}
