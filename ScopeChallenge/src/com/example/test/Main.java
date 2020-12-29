package com.example.test;

import java.awt.*;
import java.util.Scanner;

public class Main {
    // CHALLENGE
    // Write a small program to read an integer from the keyboard.
    // (using Scanner) and print out the times table for that number.
    // The table should run from 1 to 12.

    // You are allowed to use one variable called Scanner for your
    // Scanner instance. You can use as many other variables as you
    // need, but they must all be called x. That includes any class
    // instances and loop control variables that you may decide to use.

    // If you use a class, the class can be called X (capital), but any
    // instances of it must be called x (lower case).

    // Any methods you create must also be called x.

    // Optional extra:
    // Change your program so that ALL variables (incuding the Scanner
    // instance) are called x.

    public static void main(String[] args) {

        // FIRST WAY
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        // this will output: Please enter a number:  (I entered 2)
//        X x = new X(scanner.nextInt());
//        x.x();
        // this will output:
        // 1 times 2 equals 2
        // 2 times 2 equals 4
        // 3 times 2 equals 6
        // 4 times 2 equals 8
        // 5 times 2 equals 10
        // 6 times 2 equals 12
        // 7 times 2 equals 14
        // 8 times 2 equals 16
        // 9 times 2 equals 18
        // 10 times 2 equals 20
        // 11 times 2 equals 22
        // 12 times 2 equals 24

        // 2ND WAY -- not a way you would really code.
        X x = new X(new Scanner(System.in));
        x.x();
    }
}
