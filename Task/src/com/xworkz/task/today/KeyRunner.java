package com.xworkz.task.today;

public class KeyRunner {
    public static void main(String[] args) {
        Key key = new Key("Door", "Steel", false);
        System.out.println("Key " + key.toString());

        int code = key.hashCode();
        String value="value";
        System.out.println("Safe:" + key.hashCode());
        System.out.println("Safe:" + value.hashCode());

        Key key1 = new Key("Office", "Metal", true);
        boolean equal= key1.equals(key1);
        System.out.println("equal :"+ equal);
    }
}
