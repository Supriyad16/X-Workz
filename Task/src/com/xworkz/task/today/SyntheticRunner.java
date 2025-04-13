package com.xworkz.task.today;

public class SyntheticRunner {
    public static void main(String[] args) {
        Synthetic synthetic = new Synthetic("Ployester", "Avara", true);
        System.out.println("Synthetic " + synthetic.toString());

        int code = synthetic.hashCode();
        String value="clothes";
        System.out.println("Dress Material:" + synthetic.hashCode());
        System.out.println("Dress Material:" + value.hashCode());

        Synthetic synthetic1 = new Synthetic("Nylon", "W", false);
        boolean equal= synthetic1.equals(synthetic1);
        System.out.println("equal :"+ equal);
    }
}
