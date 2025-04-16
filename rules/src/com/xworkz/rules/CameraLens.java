package com.xworkz.rules;

public class CameraLens implements Lens {

    @Override
    public void focus() {
        System.out.println("Focusing with the camera lens");
    }

    @Override
    public void zoom() {
        System.out.println("Zooming with the camera lens");
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting the camera lens");
    }

    public static void main(String[] args) {
        CameraLens lens = new CameraLens();
        lens.focus();
        lens.zoom();
        lens.adjust();
    }
}
