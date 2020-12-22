package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    // this accepts console input
    private static int[] baseData = new int[10];
    // base array that takes 10 elements

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers:");
        getInput();
        printArray(baseData);
    }
    private static void getInput() {
        // purpose is to get data from console and save into array
        for(int i = 0; i < baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }
    private static void printArray(int[] arr) {
        // purpose to print out array contents
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }
    private static void resizeArray() {
        // takes copy of baseData array creates a new array and changes the size
        int[] original = baseData;
        for(int i = 0; i < original.length; i++) {
            // goes through whole array and takes new elements and saves into array
            // making copied original longer than original.
            baseData[i] = original[i];
        }
    }
    // you could also just add to array like this.
    // baseData[10] = 67;
    // baseData[11] = 34;   etc.

    // ArrayLists handle resizing automatically.
    // don't need to worry about resizing.

}
