package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
    // this will output:
        // Integer Minimum Value = -2147483648
        // Integer Maximum Value = 2147483647
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        // the output will be:
        // Busted MAX value = -2147483648  // this was too large of a number so it overflowed
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));
        // this will output: Busted MIN value = 2147483647 this was too small so it underflowed
    }
}