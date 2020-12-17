package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    // CHALLENGE
    // Read the numbers from the console entered by the user and print
    // the minimum and maximum number the user has entered.
    // Before the user enters the number, print the message "Enter
    // number:"
    // If the user enters an invalid number, break out of the loop and
    // print the minimum and maximum number.
    // HINT:
    // Use an endless while loop.



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int min = 2147483647; // set to highest number an int can hold
//        int max = -2147483648; // set to lowest number an int can hold.
        // instead of above (its a bit tedious) DO INSTEAD:
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;


        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

//                if(first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }

                } else {
                break;

            }
            scanner.nextLine(); // handle input
        }
        System.out.println("min = " + min + ", max = " + max);
        // if type 1 2 3 will output:
        // Enter number:
        // 1
        // Enter number:
        // 2
        // Enter number:
        // 3
        // Enter number:
        // a
        // min = 1, max = 3
        scanner.close();
    }
}
