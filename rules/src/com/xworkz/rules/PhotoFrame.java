package com.xworkz.rules;

public class PhotoFrame implements Frame {

    @Override
    public void hang() {
        System.out.println("Hanging the photo frame");
    }

    @Override
    public void support() {
        System.out.println("Supporting the photo frame on a shelf");
    }

    @Override
    public void display() {
        System.out.println("Displaying the photo in the frame");
    }

    public static void main(String[] args) {
        PhotoFrame frame = new PhotoFrame();
        frame.hang();
        frame.support();
        frame.display();
    }
}
