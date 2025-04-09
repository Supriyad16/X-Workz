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
    public String toString() {
        return "[layout=" + layout + ", isMechanical=" + isMechanical + ", brand=" + brand + "]";
    }
}
