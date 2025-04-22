package com.xworkz.information.runner;

import com.xworkz.information.internal.Camera;
import com.xworkz.information.internal.CameraImp;
import com.xworkz.information.external.Studio;

public class CameraRunner {

    public static void main(String[] args) {
        Camera camera = new CameraImp();
        Studio studio = new Studio(camera);
        studio.shoot();
    }
}
