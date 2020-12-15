// CHALLENGE
// Write a method called isOdd with an int parameter and call it number.
// The method needs to return a boolean.
// Check if the number is > 0, if it is not return false.
// If number is odd return true, otherwise return false.

// Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
// The method should use a for loop to sum all the odd numbers in that
// range including the end and return the sum.

// It should call the isOdd to check if each number is odd.
// The parameter end needs to be greater than or equal to start and both
// start and end parameters have to be greater than 0.
// If those conditions are not satisfied, return -1 from the method to indicate
// invalid input.
// TIPS:
// Use the remainder operator to check if the number is odd.

// MY VERSION - WRONG!

//public class SumOddRange {
//
//    public static boolean isOdd(int number) {
//        if (number > 0) {
//            return true;
//        } else if (number > 0 && number % 2 != 0) {
//            return true;
//        } else return false;
//    }
//
//    public static int sumOdd(int start, int end) {
//        for (i = 0; i > end; i++) {
//            if (end >= start) {
//                return i;
//            } else return -1;
//        }
//    }
//}

    // CORRECT VERSION
    public class SumOddRange {

        public static boolean isOdd(int number) {
            if (number < 0) {
                return false;
            } else if (number % 2 != 0) {
                return true;
            } else {
                return false;
            }
        }

        public static int sumOdd(int strtNum, int endNum) {
            if (strtNum < 0 || endNum < strtNum) {
                return -1;
            }
            int sum = 0;
            for (int i = strtNum; i <= endNum; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
                if (i == endNum) {
                }
            }
            return sum;
        }
    }

