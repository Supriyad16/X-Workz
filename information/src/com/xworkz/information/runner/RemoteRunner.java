package com.xworkz.information.runner;

import com.xworkz.information.internal.Remote;
import com.xworkz.information.internal.RemoteImp;
import com.xworkz.information.external.Television;

public class RemoteRunner {

    public static void main(String[] args) {
        Remote remote = new RemoteImp();
        Television tv = new Television(remote);
        tv.switchChannel();
    }
}
