package com.xworkz.task.today;

public class ChipRunner {

    public static void main(String[] args) {
        Chip chip = new Chip("Processor", "Intel", 7);
        System.out.println("Chip " + chip.toString());

        int code = chip.hashCode();
        String value="size";
        System.out.println("Memory:" + chip.hashCode());
        System.out.println("Memory:" + value.hashCode());

        Chip chip1 = new Chip("Processor", "Nvidia", 9);
        boolean equal= chip1.equals(chip1);
        System.out.println("equal :"+ equal);
    }
}
