// CHALLENGE
// Write a method named printFactors with one parameter of type
// int named number.
// If number is < 1, the method should print "Invalid Value".
// The method should print all factors of the number. A factor
// of a number is an integer which divides that number wholly (without
// leaving a remainder).
// For example, 3 is a factor of 6 because 3 fully divides 6 without
// leaving a remainder. In other words 6 / 3 = 2.
// HINT:
// Use a for loop or while loop.

// MY VERSION _ CORRECT!
public class FactorPrinter {
    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    // TEACHER VERSION
//    public static void printFactors(int number) {
//        int divisor = 1;
//        if (number < 1) {
//            System.out.println("Invalid value");
//        } else {
//            while (true) {
//                if (number % divisor == 0) {
//                    System.out.println(divisor);
//                }
//                divisor++;
//                if (divisor > number) {
//                    break;
//                }
//
//            }
//        }
//    }
}
