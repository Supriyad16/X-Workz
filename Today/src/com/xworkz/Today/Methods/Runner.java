package com.xworkz.Today.Methods;

public class Runner {

    public static void main(String[] args) {

        Display display =new Display();
        Shop shop = new Shop();
        shop.run(display);
        System.out.println(" ");


        Poster poster = new Poster();
        Theater theater = new Theater();
        theater.show(poster);
        System.out.println(" ");

        RCB rcb = new RCB();
        Karnataka karnataka = new Karnataka();
        karnataka.state(rcb);
        System.out.println(" ");

        Space space = new Space();
        Particles particles = new Particles();
        particles.stars(space);
        System.out.println(" ");

        Rocket rocket = new Rocket();
        Scientist scientist = new Scientist();
        scientist.Isro(rocket);
        System.out.println(" ");

        Dolo650 dolo650 = new Dolo650();
        Medicine medicine = new Medicine();
        medicine.health(dolo650);
        System.out.println(" ");

        Barber barber = new Barber();
        Man man = new Man();
        man.hair(barber);
        System.out.println(" ");

        Camera camera = new Camera();
        Video video = new Video();
        video.tape(camera);
        System.out.println(" ");

        Mango mango = new Mango();
        Fruit fruit = new Fruit();
        fruit.tasty(mango);
        System.out.println(" ");

        Pillow pillow = new Pillow();
        Sleep sleep = new Sleep();
        sleep.peace(pillow);
        System.out.println(" ");


    }
}
