package com.xworkz.task.today;

public class LANCableRunner {

    public static void main(String[] args) {
        LANCable lancable = new LANCable("Cat6", 10, true);
        System.out.println("LANCable " + lancable.toString());

        int code = lancable.hashCode();
        String value="internet";
        System.out.println("Port:" + lancable.hashCode());
        System.out.println("Port:" + value.hashCode());

        LANCable lanCable1 = new LANCable("Cat6a", 20, false);
        boolean equal= lanCable1.equals(lanCable1);
        System.out.println("equal :"+ equal);
    }
}