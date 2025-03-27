package com.xworkz.projector;

public class Runner {

    Lens lens;
    Lamp lamp;
    Port port;
    Wire wire;
    Board board;
    Button button;
    Panel panel;
    Remote remote;
    Screw screw;

    Runner() {
        lens = new Lens("Concave", 100);
        lamp = new Lamp(250, "Crompton");
        port = new Port("LAN", 1);
        wire = new Wire("Copper", 100);
        board = new Board("I555", 100);
        button = new Button("Round", "Plastic");
        panel = new Panel(5, "Metal");
        remote = new Remote(500, "Luminous");

    }

    void startProjector() {
        System.out.println("Projector is starting...");
        lamp.turnOn();
        button.press();
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.startProjector();
        //Panel panel = new Panel();
        //panel.showPanelDetails();
    }
}

