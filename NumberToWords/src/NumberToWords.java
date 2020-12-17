// CHALLENGE
// Write a method called numberToWords with one int parameter
// named number.
// The method should print out the passed number using words for the
// digits.
// If the number is negative, print "Invalid Value".
// To print the numbers as words, follow these steps:
// 1. Extract the last digit of the give number using the remainder
// operator.
// 2. Convert the value of the digital found in Step 1 into a word.
// There are 10 possible values for that digit, those being 0, 1, 2, 3,
// 4, 5, 6, 7, 8, 9.
// Print the corresponding word for each digit, e.g. print "Zero"
// if the digit is 0, "One" if the digit is 1, and so on.
// 3. Remove the last digit from the number.
// 4. Repeat Steps 2 through 4 until the number is 0.

// The logic above is correct, but in its current state, the words will
// be printed in reverse order. For example, if the number is 234,
// the logic above will produce the output "Four Three Two" instead of
// "Two Three Four". To overcome this problem, write a second method
// called reverse.

// The method reverse should have one int parmeter and return the
// reversed number (int). For example, if the number passed is 234,
// then the reversed number would be 432. The method reverse should also
// reverse negative numbers.

// Use the method reverse within the method numberToWords in order to print
// the words in correct order.

// Another thing to keep in mind is any reversed number with leading zeros
// (e.g. the revered number for 100 is 001).
// The logic above for the method numberToWords will print "One",
// but that is incorrect.
// It should print "One Zero Zero". To solve this problem, write a
// third method called getDigitCount.

// The method getDigitCount should have one int parameter called number
// and should return the count of the digits in that number.
// If the number is negative, return -1 to indicate an invalid value.
// For example: if the number has a value of 100, the method
// getDigitCount should return 3 since the number 100 has 3 digits
// (1, 0, 0).

// HINT:
// Use a for loop to print zeroes after reversing the number.
// As seen in previous example, 100 reversed becomes 1, but the method
// numberToWords should print "One Zero Zero".
// To get the number of zeroes, check the difference between the digit
// count from the original number and the reversed number.

public class NumberToWords {
    // MY VERSION _ WRONG!!

//    public static int getDigitCount (int number) {
//        int digitCount = 0;
//        if (number < 0) {
//            return -1;
//        } else if (number == 0) {
//            digitCount = 1;
//        } else {
//            while(number > 0) {
//                int t = number % 10;
//                if(t >= 0) {
//                    digitCount++;
//                }
//                number = number / 10;
//                }
//            }
//        return digitCount;
//        }
//
//
//
//    public static int reversed (int number) {
//        int reverse = 0;
//        while(number != 0) {
//            int l = number % 10;
//            reverse *= 10;
//            reverse = reverse + l;
//            number = number / 10;
//        }
//
//    }
//
//    public static void numberToWords (int number) {
//        int reverse1 = reverse1(number);
//        int countNumber = getDigitCount(number);
//        int countReverse = getDigitCount(reverse1);
//        int diff = countNumber - countReverse;
//        if (number == 0) {
//            System.out.println("Zero");
//        }
//        if (number < 0) {
//            System.out.println("Invalid Value");
//        }
//        while (reverse1 > 0) {
//            int t = reverse1 % 10;
//            if (t == 0) {
//                System.out.println("Zero");
//            } else if (t == 1) {
//                System.out.println("One");
//            } else if (t == 2) {
//                System.out.println("Two");
//            } else if (t == 3) {
//                System.out.println("Three");
//            } else if (t == 4) {
//                System.out.println("Four");
//            } else if (t == 5) {
//                System.out.println("Five");
//            } else if (t == 6) {
//                System.out.println("Six");
//            } else if (t == 7) {
//                System.out.println("Seven");
//            } else if (t == 8) {
//                System.out.println("Eight");
//            } else if (t == 9) {
//                System.out.println("Nine");
//            } else {
//                System.out.println("Invalid Value");
//            }
//        }
//
//    }
    // CORRECT VERSION:
    public static void numberToWords(int number) {
        int reversedNumber = reverse(number);
        int lastDigit = 0;
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            if ((getDigitCount(reversedNumber) == 1)&&(number>9)) {
                while (reversedNumber > 0) {
                    lastDigit = reversedNumber % 10;
                    if (lastDigit == 1) {
                        System.out.println("One");
                    } else if (lastDigit == 2) {
                        System.out.println("Two");
                    } else if (lastDigit == 3) {
                        System.out.println("Three");
                    } else if (lastDigit == 4) {
                        System.out.println("Four");
                    } else if (lastDigit == 5) {
                        System.out.println("Five");
                    } else if (lastDigit == 6) {
                        System.out.println("Six");
                    } else if (lastDigit == 7) {
                        System.out.println("Seven");
                    } else if (lastDigit == 8) {
                        System.out.println("Eight");
                    } else if (lastDigit == 9) {
                        System.out.println("Nine");
                    }
                    reversedNumber /= 10;
                }

                for (int i = 1; i < getDigitCount(number); i++) {
                    System.out.println("Zero");
                }

            }
            else if(number == 0){
                System.out.println("Zero");
            }
            else {
                while (reversedNumber > 0) {
                    lastDigit = reversedNumber % 10;

                    if (lastDigit == 0) {
                        System.out.println("Zero");
                    } else if (lastDigit == 1) {
                        System.out.println("One");
                    } else if (lastDigit == 2) {
                        System.out.println("Two");
                    } else if (lastDigit == 3) {
                        System.out.println("Three");
                    } else if (lastDigit == 4) {
                        System.out.println("Four");
                    } else if (lastDigit == 5) {
                        System.out.println("Five");
                    } else if (lastDigit == 6) {
                        System.out.println("Six");
                    } else if (lastDigit == 7) {
                        System.out.println("Seven");
                    } else if (lastDigit == 8) {
                        System.out.println("Eight");
                    } else if (lastDigit == 9) {
                        System.out.println("Nine");
                    }

                    reversedNumber /= 10;
                }
                int c = reverse(number);
                int a = getDigitCount(number);
                int b = getDigitCount(c);
                if (a != b){
                    for(int i = 0; i < a-b; i++){
                        System.out.println("Zero");
                    }
                }
            }
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        if (number < 0) {
            number *= -1;
            while (number > 0) {
                int lastDigit = number % 10;
                reversed = reversed * 10 + lastDigit;
                number /= 10;
            }
            return reversed *= -1;
        } else {
            while (number > 0) {
                int lastDigit = number % 10;
                reversed = reversed * 10 + lastDigit;
                number /= 10;
            }
            return reversed;
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else {
            do{
                number = number / 10;
                count++;
            }
            while (number > 0);
        }
        return count;
    }


}
