package com.xworkz.information.runner;

import com.xworkz.information.internal.Lock;
import com.xworkz.information.internal.LockImp;
import com.xworkz.information.external.Key;

public class LockRunner {

    public static void main(String[] args) {
        Lock lock = new LockImp();
        Key key = new Key(lock);
        key.unlock();
    }
}
