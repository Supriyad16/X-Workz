package com.xworkz.task.today;

public class Keyboard {

    private String layout;
    private boolean isMechanical;
    private String brand;

    public Keyboard(String layout, boolean isMechanical, String brand) {
        this.layout = layout;
        this.isMechanical = isMechanical;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Keyboard keyboard = this;
                Keyboard keyboard1 = (Keyboard) obj;
                if (keyboard1.layout.equals(keyboard1.layout) && keyboard1.brand==keyboard1.brand) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public String toString() {
        return "[layout=" + layout + ", isMechanical=" + isMechanical + ", brand=" + brand + "]";
    }
}
