package com.myself;

import java.io.PrintStream;

public class ConsoleLoggerModule {

    private static ConsoleLoggerModule singleton = null;  // 单例模式

    private PrintStream console = null;  // 输出端
    private PrintStream err = null;

    public void prepare(){
        if(singleton == null){
            singleton = new ConsoleLoggerModule();
        }
        singleton.console = System.out;
        singleton.err = System.err;
    }

    public void unprepare(){
        if(singleton.console != null){
            singleton.console.flush();
            singleton.console.close();
        }
        if(singleton.err != null){
            singleton.err.flush();
            singleton.err.close();
        }
    }

    public void execute(){

    }
}
