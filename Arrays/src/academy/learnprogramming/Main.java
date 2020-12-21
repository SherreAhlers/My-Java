package academy.learnprogramming;

import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {

        // ARRAYS -- different ways to initialize arrays
        // allows you to store a sequence of values that are
        // all of the same type.
        // works for all primative types.
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int[] myIntegers = getIntegers(5);
            for (int i = 0; i < myIntegers.length; i++) {
                System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
            }
            System.out.println("The average is " + getAverage(myIntegers));
            // this will output:
            // Element 0, typed value was 1
            // Element 1, typed value was 4
            // Element 2, typed value was 5
            // Element 3, typed value was 6
            // Element 4, typed value was 7
            // The average is 4.6
        }

        public static int[] getIntegers(int number) {
            System.out.println("Enter " + number + " integer values. \r");
            int[] values = new int[number];

            for (int i = 0; i < values.length; i++) {
                values[i] = scanner.nextInt();
            }
            return values;
            // this will return
            // Element 0, typed value was 10
            // Element 1, typed value was 20
            // Element 2, typed value was 30
            // Element 3, typed value was 40
            // Element 4, typed value was 50
        }
        public static double getAverage(int[] array) {
            int sum = 0;
            for(int i = 0; i < array.length; i++) {
                sum += array[i];
                // the += means we are adding to array
            }
            return (double) sum / (double) array.length;
        }
        }


//        int[] myIntArray = new int[10];

//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//    }
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + ", value is " + array[i]);
            // this will output:
            // Element 0, value is 0
            // Element 1, value is 10
            // Element 2, value is 20
            // Element 3, value is 30
            // Element 4, value is 40
            // Element 5, value is 50
            // Element 6, value is 60
            // Element 7, value is 70
            // Element 8, value is 80
            // Element 9, value is 90
//        }
//    }

//        int myVariable = 50; // this is a variable
//        int[] myIntArray = new int[10];
        // the number in the [] are saying there will be this many
        // values in the array
//        myIntArray[5] = 50;
        // the above says element 6 will be 50

//        int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // if you know the values you want in the array input them
        // like above.
//        System.out.println(myIntArray[0]);
        // this will output: 1
//        System.out.println(myIntArray[6]);
        // this will output: 7
//        System.out.println(myIntArray[8]);
        // this will output: 9


//        int[] myIntArray = new int[10];

//        for(int i = 0; i < 10; i++) {
//            myIntArray[i] = i * 10;
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        // this will output:
        // Element 0, value is 0
        // Element 1, value is 10
        // Element 2, value is 20
        // Element 3, value is 30
        // Element 4, value is 40
        // Element 5, value is 50
        // Element 6, value is 60
        // Element 7, value is 70
        // Element 8, value is 80
        // Element 9, value is 90
//        }

//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);
        // this will output: 50

//        int[] myIntArray = new int[10];
//
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//        for(int i = 0; i < myIntArray.length; i++) {
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        // this will output:
        // Element 0, value is 0
        // Element 1, value is 10
        // Element 2, value is 20
        // Element 3, value is 30
        // Element 4, value is 40
        // Element 5, value is 50
        // Element 6, value is 60
        // Element 7, value is 70
        // Element 8, value is 80
        // Element 9, value is 90
//        }
//    }


