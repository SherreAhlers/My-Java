package com.example._static;
// static methods and fields belong to class not to instance of class.

public class StaticTest {
    private static int numInstances = 0;
    // the static will allow the main to use the above
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
        // this means everytime this is used it will increment by 1.
    }

    public static int getNumInstances() {
        // the static will allow the main to use the above
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
