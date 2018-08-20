package com.myself;

public class SafeHodler {

    private Heavy heavy ;

    public synchronized Heavy getHeavy(){
        if(heavy == null){
            heavy = new Heavy();
        }
        return heavy;
    }
}
