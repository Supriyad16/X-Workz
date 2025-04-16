package com.xworkz.rules;

public class Anchor implements Towel, Toy, Tray, Tub, Watch {

    @Override
    public void dry() {
        System.out.println("Drying with towel");
    }

    @Override
    public void wash() {
        System.out.println("Washing with towel");
    }

    @Override
    public void fold() {
        System.out.println("Folding the towel");
    }

    @Override
    public void play() {
        System.out.println("Playing with the toy");
    }

    @Override
    public void makeSound() {
        System.out.println("Toy making sound");
    }

    @Override
    public void move() {
        System.out.println("Moving the tray");
    }

    @Override
    public void serve() {
        System.out.println("Serving with the tray");
    }

    @Override
    public void holdItems() {
        System.out.println("Holding items in the tray");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the tub");
    }

    @Override
    public void fill() {
        System.out.println("Filling the tub with water");
    }

    @Override
    public void drain() {
        System.out.println("Draining the tub");
    }

    @Override
    public void soak() {
        System.out.println("Soaking in the tub");
    }

    @Override
    public void showTime() {
        System.out.println("Showing time on the watch");
    }

    @Override
    public void setAlarm() {
        System.out.println("Setting alarm on the watch");
    }

    @Override
    public void tick() {
        System.out.println("Watch ticking");
    }

    public static void main(String[] args) {
        Towel towel = new Anchor();
        towel.dry();
        towel.wash();
        towel.fold();

        Toy toy = new Anchor();
        toy.play();
        toy.makeSound();

        Tray tray = new Anchor();
        tray.clean();
        tray.serve();
        tray.holdItems();

        Tub tub = new Anchor();
        tub.fill();
        tub.drain();
        tub.soak();

        Watch watch = new Anchor();
        watch.showTime();
        watch.setAlarm();
        watch.tick();
    }
}
