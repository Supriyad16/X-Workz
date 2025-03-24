package xworkz.Assign;

public class HouseKeep {
    Transport transport;

    public HouseKeep(Transport transport) {
        this.transport = transport;
    }

    public void display() {
        System.out.println("HouseKeep Details:");
        transport.display();
    }
}
