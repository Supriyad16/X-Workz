package com.xworkz.external;

import com.xworkz.rules.Pad;
import com.xworkz.rules.Pencil;

public class Write implements Pad, Pencil {

    @Override
    public void write() {
        System.out.println("Writing on the pad with the pencil");
    }

    @Override
    public void bind() {
        System.out.println("Erasing the writing with the pencil eraser");
    }

    @Override
    public void tear() {
        System.out.println("Sharpening the pencil");
    }

    @Override
    public void sharpen() {
        System.out.println("Opening the pad");
    }

    @Override
    public void breakTip() {
        System.out.println("Closing the pad");
    }

    @Override
    public void wrote() {
        System.out.println("Storing the pad away");
    }

    public static void main(String[] args) {
        Pad pad = new Write();
        pad.write();
        pad.bind();
        pad.tear();

        Pencil pencil = new Write();
        pencil.sharpen();
        pencil.breakTip();
        pencil.wrote();
    }
}