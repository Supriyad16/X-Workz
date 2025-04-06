package com.xworkz.fest.work;

class Hold extends Shelf {
    Hold() {
        super();
        System.out.println("Hold class");
    }

    @Override
    public void store() {
        System.out.println("Shelf is used to hold items.");
    }

    @Override
    public void wood() {
        System.out.println("Shelf can be made of wood.");
    }

    @Override
    public void madeOf() {
        System.out.println("Shelves are commonly used in homes.");
    }

    @Override
    public void differentSizes() {
        System.out.println("Shelves come in different sizes.");
    }

    @Override
    public void organization() {
        System.out.println("Shelf helps in organizing.");
    }
}