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
        // Busted MAX value = -2147483648  // this was too large of a number so it overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));
        // this will output: Busted MIN value = 2147483647 this was too small so it underflow

//        int myMaxIntTest = 2147483648 + 1;
        // the above won't work because that is the max number so cannot add 1 to it.
        // you can enter numbers in this format if too hard to read:
        // 2_147_483_648   the underscores act as ,

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        // this will output: Byte Minimum Value = -128
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        // this will output: Byte Maximum Value = 127

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        // this will output: Short Minimum Value = -32768
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        // this will output: Short Maximum Value = 32767

        long myLongValue = 100L;
        // must add the L to the end of the number for a long
        // 2 to the power of 63
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        // this will output: Long Minimum Value = -9223372036854775808
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        // this will output: Long Maximum Value = 9223372036854775807

        // longs are twice the int
        long bigLongLiteralValue = 2_147_483_647_284L;
        System.out.println(bigLongLiteralValue);
        // this will output: 2147483647284

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

//        byte myNewByteValue = (myMinByteValue / 2);
        // the above will get an error because anything in parenthesis means it is an int
        // instead do this:
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
        // must specify the type or java will think it is an int.



    }
}