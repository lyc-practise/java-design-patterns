package com.myself;

public class Request {

    private String value;

    public Request(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "request " + value;
    }
}
