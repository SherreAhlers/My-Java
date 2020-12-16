// CHALLENGE
// Write a method named hasSameLastDigit with three parameters of type
// int.
// Each number should be within the range of 10 (inclusive) - 1000 (inculsive)
// If one of the numbers is not within the range, the method should return false.
// The method should return true if at least two of the numbers share the same
// rightmost digit; otherwise, it should return false.

// Write another method named isValid with one parameter of type int.
// The method needs to return true if the number parameter is in the
// range of 10 - 1000, otherwise return false.

 public class LastDigitChecker {
    // MY VERSION - NOT CORRECT...
//    public static boolean isValid(int num) {
//        if (num < 10 || num > 1000) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//     public static boolean hasSameLastDigit(int x, int y, int z) {
//         if (((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 10 || z > 1000))) {
//             return false;
//         } else {
//             int rSideDigit = 0;
//             int xRightSideDigit = rSideDigit % 10;
//             int yRightSideDigit = rSideDigit % 10;
//             int zRightSideDigit = rSideDigit % 10;
//             return xRightSideDigit == yRightSideDigit || xRightSideDigit == zRightSideDigit || yRightSideDigit == zRightSideDigit;
//
//         }
//     }


     // TEACHER VERSION

     public static boolean isValid(int number){
         return number >= 10 && number <= 1000;
     }

     public static boolean hasSameLastDigit(int num1, int num2, int num3) {
         if (! isValid(num1) ||  !isValid(num2) ||  !isValid(num3)){
             return false;
         }
         int rightmostNum1 = num1 % 10;
         int rightmostNum2 = num2 % 10;
         int rightmostNum3 = num3 % 10;

         return ((rightmostNum1 == rightmostNum2) || (rightmostNum1 == rightmostNum3) || (rightmostNum2 == rightmostNum3));
     }

 }
