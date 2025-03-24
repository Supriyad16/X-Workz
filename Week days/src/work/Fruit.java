package work;

public class Fruit {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.health();

    }

    String name;
    private int kg;
    public String colour;

    public void health() {
        name = "Mango";
        kg = 10;
        colour = "Yellow";
        System.out.println("This is a " + name + " which has " + kg + "kg" + " And it is in " + colour+ " Colour");
        this.medicine();
        }

        private void medicine(){
        name = "Grapes";
        kg = 5;
        colour = "Green";
        System.out.println("This is a " + name + "which has " + kg + "kg" + " And it is in " + colour);


    }
}






