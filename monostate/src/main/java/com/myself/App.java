package com.myself;

public class App {

    public static void main(String[] args) {

        LoadBalance loadBalance1 = new LoadBalance();
        LoadBalance loadBalance2 = new LoadBalance();

        loadBalance1.addServer(new Server("localhost", 8084));

        loadBalance1.doServer(new Request("request1"));
        loadBalance2.doServer(new Request("request2"));
        loadBalance1.doServer(new Request("request1"));
        loadBalance2.doServer(new Request("request2"));
        loadBalance1.doServer(new Request("request1"));
        loadBalance2.doServer(new Request("request2"));


    }

}
