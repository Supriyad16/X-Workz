package com.xworkz.task.today;

public class ClipRunner {

    public static void main(String[] args) {
        Clip clip = new Clip("Hair Clip", "Black", 5);
        System.out.println("Clip " + clip.toString());

        int code = clip.hashCode();
        String value="tieHair";
        System.out.println("Claw:" + clip.hashCode());
        System.out.println("Claw:" + value.hashCode());

        Clip clip1 = new Clip("Claw Clip", "Lavender", 2);
        boolean equal= clip1.equals(clip1);
        System.out.println("equal :"+ equal);
    }
}
