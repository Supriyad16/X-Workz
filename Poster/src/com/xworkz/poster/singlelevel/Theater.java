package com.xworkz.poster.singlelevel;

public class Theater extends Movie {

    public Theater(String name, String genre) {
        super(name, genre);
    }

    public void screen() {
        System.out.println("This is a big Theater ");
    }

    public static void main(String[] args) {
        Theater theater = new Theater("Bahubali", "Historical Drama");
        System.out.println("Movie: " + theater.name + ", Genre: " + theater.genre);
        theater.play();
        theater.screen();
    }
}
