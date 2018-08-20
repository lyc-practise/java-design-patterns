package com.myself;


public class Server {

    private String host;
    private int port;
    public Server(String host, int port){
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }


    @Override
    public String toString(){
        return "server [" + host + "]" + ":" + port ;
    }

    public void serve(Request request){
        System.out.println(this + " serve " + request);
    }
}
