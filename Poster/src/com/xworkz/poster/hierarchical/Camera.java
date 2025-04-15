package com.xworkz.poster.hierarchical;

public class Camera extends Drone {
    void deliverPackage() {
        System.out.println("Delivering a package");
    }

    public static void main(String[] args) {
        Camera dd = new Camera();
        dd.fly();
        dd.deliverPackage();
    }
}
