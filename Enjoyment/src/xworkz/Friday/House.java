package xworkz.Friday;

import com.xworkz.Assign.Room;

public class House {
    String houseName;
    String location;
    int floors;
    boolean hasGarden;

    House(String houseName, String location, int floors, boolean hasGarden) {
        this.houseName = houseName;
        this.location = location;
        this.floors = floors;
        this.hasGarden = hasGarden;
    }

    public House(String alice, String newYork, Room[] rooms) {
    }

    void display() {
        System.out.println("House: " + houseName + ", Location: " + location + ", Floors: " + floors + ", Garden: " + hasGarden);
    }
}
