package com.xworkz.rules;

public class Rain implements Wire, Watch, Tub, Tray, Toy {

    @Override
    public void play() {
        System.out.println("Playing with the toy");
    }

    @Override
    public void makeSound() {
        System.out.println("Toy is making sound");
    }

    @Override
    public void move() {
        System.out.println("Toy is moving");
    }

    @Override
    public void serve() {
        System.out.println("Serving using tray");
    }

    @Override
    public void holdItems() {
        System.out.println("Holding items on the tray");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the tray or tub");
    }

    @Override
    public void fill() {
        System.out.println("Filling the tub");
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
        System.out.println("Watch is ticking");
    }

    @Override
    public void connect() {
        System.out.println("Connecting the wire");
    }

    @Override
    public void transmit() {
        System.out.println("Transmitting signal through the wire");
    }

    @Override
    public void insulate() {
        System.out.println("Insulating the wire");
    }

    public static void main(String[] args) {
        Toy toy = new Rain();
        toy.play();
        toy.makeSound();
        toy.move();

        Tray tray = new Rain();
        tray.serve();
        tray.holdItems();
        tray.clean();

        Tub tub = new Rain();
        tub.fill();
        tub.drain();
        tub.soak();

        Watch watch = new Rain();
        watch.showTime();
        watch.setAlarm();
        watch.tick();

        Wire wire = new Rain();
        wire.connect();
        wire.transmit();
        wire.insulate();
    }
}
