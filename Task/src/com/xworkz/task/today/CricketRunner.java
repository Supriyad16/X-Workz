package com.xworkz.task.today;

public class CricketRunner {

    public static void main(String[] args) {
        Cricket cricket = new Cricket("T20", 11, "Chinnaswamy Stadium");
        System.out.println("Cricket " + cricket.toString());

        int code = cricket.hashCode();
        String value="wicket";
        System.out.println("Score:" + cricket.hashCode());
        System.out.println("Score:" + value.hashCode());

        Cricket cricket1 = new Cricket("IPL", 11, "Chennai");
        boolean equal= cricket1.equals(cricket1);
        System.out.println("equal :"+ equal);
    }
}
