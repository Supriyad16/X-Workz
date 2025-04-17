package com.xworkz.external;

import com.xworkz.rules.Mirror;

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

    @Override
    public void refract(){
        System.out.println("wall mirror refracts");
    }

    public static void main(String[] args) {
        WallMirror wallMirror = new WallMirror();
        wallMirror.reflect();
        wallMirror.hang();
        wallMirror.clean();
        wallMirror.refract();
    }
}
