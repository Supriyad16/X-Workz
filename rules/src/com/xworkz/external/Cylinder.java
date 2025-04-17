package com.xworkz.external;

import com.xworkz.rules.Pin;
import com.xworkz.rules.Pipe;

public class Cylinder implements Pin, Pipe {

    @Override
    public void bend() {
        System.out.println("Pinning with the pin");
    }

    @Override
    public void remove() {
        System.out.println("Unpinning the pin");
    }

    @Override
    public void stick() {
        System.out.println("Securing with the pin");
    }

    @Override
    public void bends() {
        System.out.println("Bending the pipe");
    }

    @Override
    public void cut() {
        System.out.println("Connecting the pipe");
    }

    @Override
    public void flow() {
        System.out.println("Sealing the pipe");
    }

    public static void main(String[] args) {
        Pin pin = new Cylinder();
        pin.bend();
        pin.remove();
        pin.stick();

        Pipe pipe = new Cylinder();
        pipe.bends();
        pipe.cut();
        pipe.flow();
    }
}
