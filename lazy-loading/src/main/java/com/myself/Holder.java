package com.myself;

public class Holder {

    private Heavy heavy;

    public Heavy getHeavy(){
        if(null == heavy){
            heavy = new Heavy();
        }
        return heavy;
    }
}
