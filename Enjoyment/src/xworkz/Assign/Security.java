package xworkz.Assign;


public class Security {
    Personnel[] personnel;

    Security(Personnel[] personnel) {
        this.personnel = personnel;
    }

    void display() {
        System.out.println("Security Details:");
        for (Personnel p : personnel) {
            p.display();
        }
    }
}
