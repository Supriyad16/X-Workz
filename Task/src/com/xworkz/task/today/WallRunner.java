package com.xworkz.task.today;

public class WallRunner {

    public static void main(String[] args) {
        Wall wall = new Wall("Concrete", 10.5, "White");
        System.out.println("Wall " + wall.toString());

        int code = wall.hashCode();
        String value = "design";
        System.out.println("Tiles:" + wall.hashCode());
        System.out.println("Tiles:" + value.hashCode());

        Wall wall1 = new Wall("Brick", 1.5, "Brown");
        boolean equal= wall1.equals(wall1);
        System.out.println("equal :"+ equal);
    }
}
