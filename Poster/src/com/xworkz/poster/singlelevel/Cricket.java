package com.xworkz.poster.singlelevel;

public class Cricket extends Sports {

    public Cricket(String type, int players) {
        super(type, players);
    }

    public void bat() {
        System.out.println("Cricket involves batting and bowling");
    }

    public static void main(String[] args) {
        Cricket cricket = new Cricket("Outdoor", 11);
        System.out.println("Type: " + cricket.type + ","+" Players: " + cricket.players);
        cricket.play();
        cricket.bat();
    }
}
