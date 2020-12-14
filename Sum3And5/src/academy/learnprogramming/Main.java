package academy.learnprogramming;

public class Main {
    // CHALLENGE
    // Create a for statement using a range of numbers from 1 to 1000 inclusive.
    // Sum all the numbers that can be divided with both 3 and also 5.
    // For those numbers that met the above conditions, print the number
    // break out of the loop once you find 5 numbers that met the above conditions.
    // After breaking out of the loop print the sum of the numbers that met the above condition


    public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    for (int i = 1; i <= 1000; i++) {
        if((i % 3 == 0) && (i % 5 == 0)) {
            // the first part is checking if number is divisible by 3
            // the next part is checking if number is divisible by 5
            // both must be true
            count ++;
            sum += i;
            System.out.println("Found number =  " + i);
            // this will output:
            // Found number =  15
            // Found number =  30
            // Found number =  45
            // Found number =  60
            // Found number =  75
        }

        if(count == 5) {
            break;
        }
    }

        System.out.println("Sum = " + sum);
        // this will output: Sum = 225

    }

}
