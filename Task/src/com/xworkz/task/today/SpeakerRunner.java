package com.xworkz.task.today;

public class SpeakerRunner {

    public static void main(String[] args) {
        Speaker speaker = new Speaker("JBL", 20, true);
        System.out.println("Speaker " + speaker.toString());

        int code = speaker.hashCode();
        String value="Sound";
        System.out.println("Audio:" + speaker.hashCode());
        System.out.println("Audio:" + value.hashCode());
    }
}
