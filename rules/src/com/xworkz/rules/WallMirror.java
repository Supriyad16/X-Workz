package com.xworkz.rules;

public class WallMirror implements Mirror {

    @Override
    public void reflect() {
        System.out.println("Reflecting the image on the wall mirror");
    }

    @Override
    public void hang() {
        System.out.println("Hanging the wall mirror");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the wall mirror");
    }

    public static void main(String[] args) {
        WallMirror mirror = new WallMirror();
        mirror.reflect();
        mirror.hang();
        mirror.clean();
    }
}
