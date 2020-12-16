// CHALLENGE
// Write a method named hasSharedDigit with two parameters of type int.
// Each number should be within the range of 10 (inclusive) - 99 (inclusive)
// If one of the numbers is not within the range, should return false.
// The method should return true if there is a digit that appears in both
// numbers, such as 2 in 12 and 23; otherwise the method should return false.


public class SharedDigit {
    public static boolean hasSharedDigit (int x, int y) {
        if ((x <= 10 || x >= 99) || (y <= 10 || y >= 99)) {
            return false;
        }
        int leftSideNum1 = x / 10;
        int rightSideNum1 = x % 10;
        int leftSideNum2 = y / 10;
        int rightSideNum2 = y % 10;
        return (leftSideNum1 == leftSideNum2 || leftSideNum1 ==
                rightSideNum2 || rightSideNum1 == leftSideNum2
                || rightSideNum1 == rightSideNum2);

        }
    }

    // OR LIKE THIS:

//    public class SharedDigit {
//        public static boolean hasSharedDigit(int num1, int num2) {
//            if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
//                return false;
//            }
//            return num1 / 10 == num2 / 10 ||
//                    num1 / 10 == num2 % 10 ||
//                    num1 % 10 == num2 / 10 ||
//                    num1 % 10 == num2 % 10;
//        }
//    }

    // OR LIKE THIS:
//    public class SharedDigit {
//
//        public static boolean hasSharedDigit(int x, int y) {
//            if (x < 10 || x > 99 || y < 10 || y > 99) {
//                return false;
//            }
//            int yInit = y;
//            while (x != 0) {
//                while (y != 0) {
//                    if (x % 10 == y % 10) {
//                        return true;
//                    }
//                    y /= 10;
//                }
//                x /= 10;
//                y = yInit;
//            }
//            return false;
//        }
//    }

    // OR LIKE THIS:
//    public static boolean hasSharedDigit(int a, int b) {
//        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
//            return false;
//        }
//        while (a > 0 || b > 0) {
//            int fDigit = a % 10;
//            int sDigit = b % 10;
//            a /= 10;
//            b /= 10;
//
//            return (a == b) || (a == sDigit) || (b == fDigit) || (fDigit == sDigit) ? true : false;
//        }
//        return false;
//    }


