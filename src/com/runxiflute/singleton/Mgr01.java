package com.runxiflute.singleton;

public class Mgr01 {
    private static final Mgr01 instance = new Mgr01();

    private Mgr01() {}

    public static Mgr01 getInstance() {
        return instance;
    }

    public static void main (String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println( m1 == m2);
    }
}
