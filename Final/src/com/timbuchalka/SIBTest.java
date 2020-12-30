package com.timbuchalka;

public class SIBTest {
    public static final String owner;

    static {
        // this is a static initialization block represented by the
        // static and code block {}
        // can be as many as would like
        // they are called in order so this one would be first
        owner = "Sherre";
        System.out.println("SIBTest static initialiazation block called.");
    }
    public SIBTest() {
        System.out.println("SIB constructor called.");
    }
    static {
        // this is a static initialization block represented by the
        // static and code block {}
        // can be as many as would like
        // they are called in order so this one would be second
        System.out.println("2nd initialization block called.");
    }
    public void someMethod() {
        System.out.println("someMethod called.");
    }
}
