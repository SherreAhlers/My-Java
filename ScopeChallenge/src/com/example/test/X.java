package com.example.test;

import java.util.Scanner;

public class X {
    private int x;



    // FIRST WAY
//    public X(int x) {
//        this.x = x;
//    }
    // or like this: 2ND WAY
    public X(Scanner x) {
        this.x = x.nextInt();
    }

    public void x() {
        for(int x = 1; x < 13; x++) {
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
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
        }
    }

}
