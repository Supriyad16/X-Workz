package com.xworkz.task.today;

public class NosePin {
    private String material;
    private boolean isStudded;
    private String shape;

    public NosePin(String material, boolean isStudded, String shape) {
        this.material = material;
        this.isStudded = isStudded;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", isStudded=" + isStudded + ", shape=" + shape + "]";
    }
}
