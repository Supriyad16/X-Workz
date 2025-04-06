package com.xworkz.fest.work;

public class PhotoRunner {
    public static void main(String[] args) {

        Photo photo = new Camera();
        photo.gallery();
        photo.click();
        photo.memories();
        photo.phone();
        photo.safe();

        Camera camera = new Camera();
        camera.gallery();
        camera.click();
        camera.memories();
        camera.phone();
        camera.safe();
    }
}
