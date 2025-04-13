package com.xworkz.task.today;

public class NailPolishRunner {

    public static void main(String[] args) {
        NailPolish nailpolish = new NailPolish("Cherry Red", "Lakme", 250);
        System.out.println("NailPolish " + nailpolish.toString());

        int code = nailpolish.hashCode();
        String value="nails";
        System.out.println("Different colours:" + nailpolish.hashCode());
        System.out.println("Different Colours:" + value.hashCode());

        NailPolish nailPolish = new NailPolish("Pink", "Ell 18", 180);
        boolean equal= nailPolish.equals(nailPolish);
        System.out.println("equal :"+ equal);
    }
}
