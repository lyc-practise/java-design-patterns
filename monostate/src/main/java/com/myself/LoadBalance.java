package com.myself;

import java.util.ArrayList;
import java.util.List;

public class LoadBalance {

    private static List<Server> serverList = new ArrayList<Server>();
    private static int index;

    static{
        serverList.add(new Server("localhost", 8080));
        serverList.add(new Server("localhost", 8081));
        serverList.add(new Server("localhost", 8082));
        serverList.add(new Server("localhost", 8083));
    }


    public static void addServer(Server server){
        synchronized (serverList){
            serverList.add(server);
        }
    }

    public static int getLastId(){
        return index;
    }

    public static int getNoServer(){
        return serverList.size();
    }

    public static void doServer(Request request){
        synchronized (serverList){
            if(index>=serverList.size()) index = 0;
            Server server = serverList.get(index++);
            server.serve(request);
        }
    }

    public static void fun(){
        System.out.println("method fun!");
    }




}
