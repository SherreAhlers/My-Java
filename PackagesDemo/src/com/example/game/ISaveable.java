package com.example.game;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

    }


    // interface defines what needs to be done but doesn't
    // define how it is done. The class does that.
//public interface ISaveable {
//    ArrayList<String> write();
//    void read(ArrayList<String> savedValues);
    // interfaces must contain a write() and a read() in a class
    // interface is abstract - must instantiate the class that uses it

//}

