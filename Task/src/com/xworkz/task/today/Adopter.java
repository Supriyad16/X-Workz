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
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Reference is not null");

            if(obj instanceof Adopter){
                System.out.println("Reference is same");

                Adopter adopter=this;
                Adopter adopter1 = (Adopter) obj;
                if (adopter1.inputType.equals(adopter.inputType) && adopter1.outputType.equals(adopter.outputType) ){
                    System.out.println("Both aare same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "[inputType=" + inputType + ", outputType=" + outputType + ", price=" + price + "]";
    }
}
