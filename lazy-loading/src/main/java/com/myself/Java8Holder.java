package com.myself;

import java.util.function.Supplier;

public class Java8Holder {

    private Supplier<Heavy> heavy = () -> createHeavy();

    public Heavy getHeavy(){
        return heavy.get();
    }



    private synchronized Heavy createHeavy(){

        class HeavyFactory implements Supplier<Heavy>{
            private final Heavy heavyInstance = new Heavy();

            @Override
            public Heavy get() {
                return heavyInstance;
            }
        }

        if(!HeavyFactory.class.isInstance(heavy)){
            heavy = new HeavyFactory();
        }
        return heavy.get();

    }
}
