package com.myself;

/**
 * write lazy loading myself
 *
 */
public class App {


    public static void main(String[] args) {

        // lazy load 1 , thread unsafe
        Holder holder = new Holder();
        System.out.println("heavy:"+holder.getHeavy());

        // lazy load2 , thread safe
        SafeHodler safeHodler = new SafeHodler();
        System.out.println("heavy:"+safeHodler.getHeavy());

        // lazy load3 , safe and effective
        Java8Holder java8Holder = new Java8Holder();
        System.out.println("heavy:"+java8Holder.getHeavy());





    }
}
