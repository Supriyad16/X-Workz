package com.xworkz.external;

import com.xworkz.rules.*;

public class Speaker implements Pencil, Pin, Pipe, Plate, Pole {

    @Override
    public void wrote() {
        System.out.println("Writing with the pencil");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the pencil");
    }

    @Override
    public void breakTip() {
        System.out.println("Breaking the pencil tip");
    }

    @Override
    public void stick() {
        System.out.println("Sticking the pin");
    }

    @Override
    public void remove() {
        System.out.println("Removing the pin");
    }

    @Override
    public void bend() {
        System.out.println("Bending the pipe");
    }

    @Override
    public void bends() {
        System.out.println("Pipe bends");
    }

    @Override
    public void flow() {
        System.out.println("Water flows through the pipe");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the plate");
    }

    @Override
    public void serve() {
        System.out.println("Serving food on the plate");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the plate");
    }

    @Override
    public void stack() {
        System.out.println("Stacking the plates");
    }

    @Override
    public void stand() {
        System.out.println("Standing the pole");
    }

    @Override
    public void support() {
        System.out.println("Pole supporting something");
    }

    @Override
    public void climb() {
        System.out.println("Climbing the pole");
    }

    public static void main(String[] args) {
        Pencil pencil = new Speaker();
        pencil.wrote();
        pencil.sharpen();
        pencil.breakTip();

        Pin pin = new Speaker();
        pin.stick();
        pin.remove();
        pin.bend();

        Pipe pipe = new Speaker();
        pipe.cut();
        pipe.bends();
        pipe.flow();

        Plate plate = new Speaker();
        plate.serve();
        plate.clean();
        plate.stack();

        Pole pole = new Speaker();
        pole.stand();
        pole.support();
        pole.climb();
    }
}
