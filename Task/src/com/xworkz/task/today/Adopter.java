package com.xworkz.task.today;

public class Adopter {

    private String inputType;
    private String outputType;
    private double price;

    public Adopter(String inputType, String outputType, double price) {
        this.inputType = inputType;
        this.outputType = outputType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[inputType=" + inputType + ", outputType=" + outputType + ", price=" + price + "]";
    }
}
