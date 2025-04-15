package com.xworkz.poster.multilevel;

public class Lock extends Handle {

    public Lock(String material, String color) {
        super(material, color);
    }

    public void secure() {
        System.out.println("Locking the door for security");
    }

    public static void main(String[] args) {
        Lock lock = new Lock("Wood", "Brown");
        System.out.println("Material: " + lock.material + ", Color: " + lock.color);
        lock.open();
        lock.rotate();
        lock.secure();
    }
}
