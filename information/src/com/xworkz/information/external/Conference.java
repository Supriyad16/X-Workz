package com.xworkz.information.external;

import com.xworkz.information.internal.Speaker;

public class Conference {

    private Speaker speaker;

    public Conference(Speaker speaker) {
        this.speaker = speaker;
        System.out.println("Arg constructor of Conference");
    }

    public void startSession() {
        System.out.println("Conference session started...");
        if (this.speaker != null) {
            this.speaker.sound();
        } else {
            System.out.println("Speaker is null");
        }
    }
}
