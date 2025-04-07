package com.xworkz.vacation.internal;

public class KeyChain extends Key{

    public void hang(Lock lock){
        lock.open();

        if (lock instanceof Key){

            Key key = (Key) lock;
            key.secure();
            key.open();
            key.close();
            key.rust();
            key.breakLock();
        }
    }
}

