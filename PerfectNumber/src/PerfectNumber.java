// CHALLENGE
// What is the perfect number?
// A perfect number is a positive integer which is equal to the sum
// of its proper number without leaving a remainder and exclude the
// perfect number itself.
// For example, take the number 6:
// Its proper divisors are 1, 2 and 3 (since 6 is the value of the
// perfect number, it is excluded), and the sum of its proper divisors
// is 1 + 2 + 3 = 6
// Therefore, 6 is a perfect number (as well as the first perfect number).

// Write a method named isPerfectNumber with one parameter of type
// int named number.
// If number is < 1, the method should return false.
// The method must calculate if the number is perfect. If the number is
// perfect, the method should return true; otherwise, return false.

// HINT:
// Use a for loop or while loop.
// Use the remainder operator.


public class PerfectNumber {

//    public static boolean isPerfectNumber(int number) {
//        if (number < 1) {
//            return false;
//        }
//        int divisors = 1;
//        int sumPerfectNumber = 0;
//        for (i = 0; i < number; i++) {
//            if (number % i != 0) {
//                return false;
//            } else if (divisors + divisors == sumPerfectNumber) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }

    // CORRECT VERSIONS:

    public static boolean isPerfectNumber(int number) {
        if (number < 1){
            return false;
        }
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum == number;
    }

    // OR LIKE THIS:

//    public static boolean isPerfectNumber(int number) {
//        if (number < 0) {
//            return false;
//        }
//        int i = 1, sum = 0;
//
//        while (i <= number) {
//            if (number % i == 0) {
//                sum += i;
//            }
//            i++;
//            if (sum == number) {
//                return true;
//            }
//        }
//        return false;
//    }
        // OR LIKE THIS:

//    public static boolean isPerfectNumber(int number){
//        int sum=0;
//        int divisor=1;
//        if (number<1){
//            return false;
//        }else {
//            while (true){
//                if (number%divisor==0){
//                    sum+=divisor;
//                }divisor++;
//                if (divisor==number){
//                    break;
//                }
//            }
//        }
//        if(number==sum){
//            return true;
//        }else {
//            return false;
//        }
//    }
}
