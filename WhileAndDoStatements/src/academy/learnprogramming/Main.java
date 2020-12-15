package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // There are multiple ways to write a statement
        // Ex: the while loop - must have an end or will be forever executing
//        int count = 1;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++; // the ++ is important here to not get a forever loop.
//        }
        // The for loop...
//        for(count = 6; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }
        // The do while loop - must have an end - do this while this condition is true
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//            if(count > 100) {
//                break; // this can be added in a do while loop to stop the code.
//            }
//        } while(count != 6);

        // CHALLENGE
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // Return true if an even number, otherwise return false.

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue; // this is different from break
                // continue will bypass the print statement or any other code left
                // then will go straight back to the beginning if while condition is still true

                // if is an even number will stop and go back to beginning until it gets to 20
            }
            System.out.println("Even Number " + number);
            // this will output:
            // Even Number 6
            // Even Number 8
            // Even Number 10
            // Even Number 12
            // Even Number 14
            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
        // this will output: Total even numbers found = 5
        // CHALLENGE
        // Modify the while code above
        // Make it also record the total number of even numbers it has found.
        // And break once 5 are found.
        // And at the end, display the total number of even numbers found


    }
    // MY VERSION - CORRECT!

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
//            System.out.println("Was even number");
            return true;
        } else {
//            System.out.println("Not even number");
            return false;
        }
    }
    // TEACHER VERSION
//    public static boolean isEvenNumber(int number) {
//        if((number % 2) == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}

