package academy.learnprogramming;

import java.util.Arrays;

public class Main {
    // CHALLENGE
    // Write a method called reverse() with an int array as a
    // parameter.
    // The method should not return any value. In other words,
    // the method is allowed to modify the array parameter.
    // In main() test the reverse() method and print the array
    // both reversed and non-reversed.
    // To reverse the array, you have to swap the elements,
    // so that the first element is swapped with the last element
    // and so on.
    // For example, if the array is {1, 2, 3, 4, 5},
    // then reversed array is {5, 4, 3, 2, 1}



    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Array = " + Arrays.toString(array));
        // this will output: Array = [1, 5, 3, 7, 11, 9, 15]

        reverse(array);

        System.out.println("Reversed array = " + Arrays.toString(array));
        // this will output: Reversed array = [15, 9, 11, 7, 3, 5, 1]


    }
    private static void reverse(int[] array) {
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength; i++) {
            // As i progresses from 0 to index of halfLength
            // each element swaps the first with the last the
            // second with next to last, etc.
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }
    }
}
