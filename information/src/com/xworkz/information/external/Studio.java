package com.xworkz.information.external;

import com.xworkz.information.internal.Camera;

public class Studio {

    private Camera camera;

    public Studio(Camera camera) {
        this.camera = camera;
        System.out.println("Arg constructor of Studio");
    }

    public void shoot() {
        System.out.println("Photo shoot started...");
        if (this.camera != null) {
            this.camera.capture();
        } else {
            System.out.println("Camera is null");
        }
    }
}
