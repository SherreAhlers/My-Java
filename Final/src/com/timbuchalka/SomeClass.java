package com.timbuchalka;

public class SomeClass {
//    private final int instanceNumber = 1;
    // both code above and below cannot be changed due to the tag
    // final in the statement.

//    public SomeClass() {
//        instanceNumber = 1;
//    }
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }
    public int getInstanceNumber() {
        return instanceNumber;
    }
}
