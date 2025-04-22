package com.xworkz.information.external;

import com.xworkz.information.internal.Remote;

public class Television {

    private Remote remote;

    public Television(Remote remote) {
        this.remote = remote;
        System.out.println("Arg constructor of Television");
    }

    public void switchChannel() {
        System.out.println("Switching channel...");
        if (this.remote != null) {
            this.remote.control();
        } else {
            System.out.println("Remote is null");
        }
    }
}
