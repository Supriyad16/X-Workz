package com.xworkz.external;

import com.xworkz.rules.Frame;

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

    @Override
    public void view(){
        System.out.println("view photo frame");
    }

    public static void main(String[] args) {
        PhotoFrame photoFrame = new PhotoFrame();
        photoFrame.hang();
        photoFrame.support();
        photoFrame.display();
        photoFrame.view();
    }
}
