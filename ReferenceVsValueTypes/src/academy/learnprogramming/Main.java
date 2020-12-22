package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        // this will output: myIntValue = 10
        System.out.println("anotherIntValue = " + anotherIntValue);
        // this will output: myIntValue = 10
        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        // this will output: myIntValue = 10
        System.out.println("anotherIntValue = " + anotherIntValue);
        // this will output: anotherIntValue = 11 - this one is
        // 11 because I incremented the anotherIntValue on line 14.

        int[] myIntArray = new int[5];
        // this is a reference
        // arrays are reference types - holds an address to object
        // but not object itself.
        int[] anotherArray = myIntArray;
        // here we are declaring another reference in memory

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        // this will print out entire contents of array and will print
        // new array with elements separated by a comma.
        // this will output: myIntArray = [0, 0, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        // this will print new array with contents of another array
        // this will output: anotherArray = [0, 0, 0, 0, 0]

        anotherArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        // this will output: after change myIntArray = [1, 0, 0, 0, 0]
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
        // this will output: after change anotherArray = [1, 0, 0, 0, 0]

        anotherArray = new int[] {4, 5, 6, 7, 8};
        // this will output: after modify anotherArray = [4, 5, 6, 7, 8]
        modifyArray(myIntArray);
        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        // this will output: after modify myIntArray = [2, 0, 0, 0, 0]
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));
        // this will output: after modify anotherArray = [2, 0, 0, 0, 0]
    }
    private static void modifyArray(int[] array) {
        // here we are going to change the array position the contents of
        // array at index 0 to 2
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
        // here we are creating a new array with elements 1 2 3 4 5
        // the above is dereferencing


    }
}
