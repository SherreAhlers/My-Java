package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// CHALLENGE
        // Write a method with the name sumDigits that has one int
        // parameter called number.
        // If pararmeter is >= 10 then the method should process the number
        // and return sum of all digits, otherwise return -1 to indicate
        // an invalid value.
        // The numbers from 0-9 have 1 digit so we don't want to process
        // them, also we don't want to process negative numbers, so also
        // return -1 for negative numbers.

        // For example: Calling method sumDigits(125) should return 8 since
        // 1 + 2 + 5 = 8.
        // Calling the method sumDigits(1) should return -1 as per requirements
        // described above...
        // HINT:
        // Use n % 10 to extract the least-significant digit.
        // Use n = n / 10 to discard the least-significant digit.

        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        // this will output: The sum of the digits in number 125 is 8
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        // the output will be: The sum of the digits in number -125 is -1
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        // the output will be: The sum of the digits in number 4 is -1
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
        // the output will be: The sum of the digits in number 32123 is 11

    }
    // MY VERSION - WRONG!
//    public static int sumDigits (int number) {
//        while (number >= 10)
//            return number + number;
//
//        if(number >= 0 || number <= 9) {
//            return -1;
//        } else return number;
//
//    }
    // TEACHER VERSION
    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while(number > 0) {
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;
            // drop the least-significant digit
            number /= 10;  // same as: number = number / 10
        }
        return sum;
    }
}
