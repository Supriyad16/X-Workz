package com.xworkz.information.runner;

import com.xworkz.information.internal.Speaker;
import com.xworkz.information.internal.SpeakerImp;
import com.xworkz.information.external.Conference;

public class SpeakerRunner {

    public static void main(String[] args) {
        Speaker speaker = new SpeakerImp();
        Conference conference = new Conference(speaker);
        conference.startSession();
    }
}
