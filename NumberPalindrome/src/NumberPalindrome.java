// CHALLENGE
// Write a method called isPalindrome with one int parameter called
// number.
// The method needs to return a boolean.
// It should return true if the number is a palindrome number otherwise
// it should return false.
// TIP:
// What is a Palindrome number? - A palindrome number is a number
// which when reversed is equal to the original number.
// For example: 121, 12321, 1001, etc.

// Logic to find palindrome number:
// Find the reverse of the given number. Store it in some variable
// say reverse.
// Compare the number with the reverse.

// If both are the same then the number is a palindrome otherwise not.

// Logic to reverse a number:
// Declare and initialize another variable to store the reverse of a number,
// for example: reverse = 0.
// Extract the last digit of the given number by performing the modulo division
// (remainder)
// Store the last digit to some variable say lastDigit = num % 10/
// Increase the place value of reverse by one.
// To increase place value multiply the reverse variable by 10 e.g.
// reverse = reverse * 10.
// Add lastDigit to reverse.
// Since the last digit of the number is processed, remove the last digit of num. To
// remove the last digit divide number by 10.
// Repeat steps until number is not equal to (or greater than zero).
// A while loop would be good to use.

// MY CODE - WRONG! NEED PRACTICE WITH WHILE

public class NumberPalindrome {
//    public static boolean isPalindrome(int number) {
//        int reverseNumber = 0;
//        int lastDigit = number % 10;
//        while(number != lastDigit) {
//
//        }
//    }

    // TEACHER VERSION
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int absNumber = Math.abs(number);
        int zeroes = (int) Math.log10(absNumber);

        while (absNumber > 0) {
            int mod = absNumber % 10;
            reverse += mod * Math.pow(10, zeroes);

            absNumber /= 10;
            zeroes--;
        }
        reverse *= number < 0 ? -1 : 1;
        return number == reverse;
    }
}
