package com.xworkz.task.today;

public class NosePinRunner {
    public static void main(String[] args) {
        NosePin nosepin = new NosePin("Silver", true, "Round");
        System.out.println("NosePin " + nosepin.toString());

        int code = nosepin.hashCode();
        String value="nose";
        System.out.println("Peirce:" + nosepin.hashCode());
        System.out.println("Peirce:" + value.hashCode());

        NosePin nosePin = new NosePin("Gold", true, "Diamond");
        boolean equal= nosePin.equals(nosePin);
        System.out.println("equal :"+ equal);
    }
}
