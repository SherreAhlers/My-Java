package com.example.test;

import com.timbuchalka.mylibrary.Series;

public class Main {

    public static void main(String[] args) {
        for(int i =0; i <= 10; i++ ) {
            System.out.println(Series.nSum(i));
            // this will output:
            // 0
            // 1
            // 3
            // 6
            // 10
            // 15
            // 21
            // 28
            // 36
            // 45
            // 55
        }
        System.out.println("====================");
        for(int i =0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
            // this will output:
            // 1
            // 1
            // 2
            // 6
            // 24
            // 120
            // 720
            // 5040
            // 40320
            // 362880
            // 3628800
        }
        System.out.println("===================");
        for(int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
            // this will output:
            // 0
            // 1
            // 1
            // 2
            // 3
            // 5
            // 8
            // 13
            // 21
            // 34
            // 55
        }
    }
}
