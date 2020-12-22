package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // CHALLENGE
    // Create a program using arrays that sorts a list of integers
    // in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in ti 106, 26, 81,
    // 5, 15 your program should ultimately have an array with 100,
    // 81, 26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read
    // in from the keyboard.
    // Implement the following methods - getIntegers, printArray,
    // and sortIntegers.
    // getIntegers returns an array of entered integers from keyboard.
    // printArray prints out the contents of the array.
    // and sortIntegers should sort the array and return a new array
    // containing the sorted numbers.
    // You will have to figure out how to copy the array elements
    // from the passed array into a new array and sort them and
    // return the new sorted array.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
        // this will output:
//        Enter 5 integer values:
//        50
//        160
//        40
//        23
//        200
//        Element 0 contents 200
//        Element 1 contents 160
//        Element 2 contents 50
//        Element 3 contents 40
//        Element 4 contents 23
    }
    // create getIntegers method
    public static int[] getIntegers(int capacity) {
        // int capacity is the size of the array
        int[] array = new int[capacity];
        // this defines array
        System.out.println("Enter " + capacity + " integer values: \r");
        // this is the message that prompts user to enter numbers - the \r
        // makes it print to multiple lines

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    // create printArray method
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
            // this will output:
        }
    }
    // create sortIntegers method - must copy contents of array into new one
    public static int[] sortIntegers(int[] array) {
        // the array being passed in is the unsorted numbers typed in from user
//        int[] sortedArray = new int[array.length];
        // this creates a new array of the same size but has no values yet
//        for(int i= 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
            // this for loop copies the values from array and saves the contents into
            // new sortedArray
        // OR LIKE THIS:
        int[] sortedArray = Arrays.copyOf(array, array.length);

        // the above line makes a copy of array by saying copy array and the amount of
        // characters in array - then automatically creates the copied array called
        // sortedArray.

//        }
        // create a while loop with a for loop inside
        boolean flag = true;
        // this sets flag to true so it will work for the first loop
        int temp;
        while(flag) {
            // while loop will continue processing until flag == false
            flag = false;
            // we are setting flag to false here because if for loop hasn't sorted all numbers
            // we will assign it back to true until while loop ends.
            for(int i = 0; i < sortedArray.length-1; i++) {
                // going through entire array each time, only exit loop if there are no
                // more elements to sort.
                if(sortedArray[i] < sortedArray[i + 1]) {
                    // this is a test to see if need to continue
                    // if sorted array at element 0 is less than sorted array at next element
                    // then we need to swap them
                    temp = sortedArray[i];
                    // store number into temp variable
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    // taking entry at element position 1 and swapping it with 0 then use while
                    // loop again to look and see if an element has higher number than the one before it
                    flag = true;

                }
            }
        }
        return sortedArray;
    }
}
