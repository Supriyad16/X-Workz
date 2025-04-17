package com.xworkz.external;

import com.xworkz.rules.Lens;

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

    @Override
    public void point(){
        System.out.println("Camera lens ");
    }

    public static void main(String[] args) {
        CameraLens cameraLens = new CameraLens();
        cameraLens.focus();
        cameraLens.zoom();
        cameraLens.adjust();
        cameraLens.point();
    }
}
