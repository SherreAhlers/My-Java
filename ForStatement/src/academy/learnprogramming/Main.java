package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        // this will output: 10,000 at 2% interest = 200.0
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 3.0));
        // this will output: 10,000 at 2% interest = 300.0
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 4.0));
        // this will output: 10,000 at 2% interest = 400.0
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 5.0));
        // this will output: 10,000 at 2% interest = 500.0

//        for(init; termination; increment) {
            // init is start of loop
            // termination will exit when it determines false
            // increment is expression invoked a number of times
        for(int i = 0; i < 5; i++) {
            // the above will keep going until it gets to 5 (will not include 5)
            // and will increment + 1 each time
            System.out.println("Loop " + i + " hello!");
            // this will output: Loop 0 hello!
            // Loop 1 hello!
            // Loop 2 hello!
            // Loop 3 hello!
            // Loop 4 hello!
        }

        // CHALLENGE
        // Using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2, 3, 4, 5, 6, 7, and 8
        // print the results to the console.

//        for(int i = 0; i < 9; i++) {
//            System.out.println("10,000 at 2% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
            // this will output:
            // 10,000 at 2% interest = 0.0
            // 10,000 at 2% interest = 100.0
            // 10,000 at 2% interest = 200.0
            // 10,000 at 2% interest = 300.0
            // 10,000 at 2% interest = 400.0
            // 10,000 at 2% interest = 500.0
            // 10,000 at 2% interest = 600.0
            // 10,000 at 2% interest = 700.0000000000001  -- to change this to a 2 decimal use the above added
            // String.format("%.2f)
            // 10,000 at 2% interest = 800.0
//        }

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        for(int i = 8; i > -1 ; i--) {
            System.out.println("10,000 at 2% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
            // this will output:
            // 10,000 at 2% interest = 800.00
            // 10,000 at 2% interest = 700.00
            // 10,000 at 2% interest = 600.00
            // 10,000 at 2% interest = 500.00
            // 10,000 at 2% interest = 400.00
            // 10,000 at 2% interest = 300.00
            // 10,000 at 2% interest = 200.00
            // 10,000 at 2% interest = 100.00
            // 10,000 at 2% interest = 0.00
        }

        // CHALLENGE
        // Create a for statement using any range of numbers.
        // Determine if the number is a prime number using the isPrime method
        // If it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // If that count is 3 exit the for loop (break).
        // HINT:
        // Use the break; statement to exit
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3) {
                    System.out.println("Exiting for loop");
                    break;

                    // the above will output:
                    // Number 11 is a prime number
                    // Number 13 is a prime number
                    // Number 17 is a prime number
                    // Exiting for loop
                }
            }
        }
    }


    public static boolean isPrime(int num) {

        if (num == 1) {
            // this test to see if the number is equal to one if equal to 1 will return false
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            // or write above like this:
//      git for (int i = 2; i <= (long) Math.sqrt(num); i++) {
            // this for loop will only look for numbers that are divisible by 2
            if (num % i == 0) {
                // this is checking if the remainder of num and i == 0 if it does it will return false
                return false;
            }
        }
        return true;
    }

    // for statement allows us to loop through code
    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
