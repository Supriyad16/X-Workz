package com.xworkz.Thursday;

public   class Inter2 implements Inter{
    @Override
    public void methods() {
        System.out.println("Running inter class");
    }

    public static void main(String[] args) {
        Inter inter = new Inter2();
        inter.methods();
    }
}