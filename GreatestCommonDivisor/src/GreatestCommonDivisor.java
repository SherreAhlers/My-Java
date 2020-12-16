// CHALLENGE
// Write a method named getGreatestCommonDivisor with two parameters
// of type int named first and second.
// If one of the parameters is < 10 , the method should return -1 to
// indicate an invalid value.
// The method should return the greatest common divisor of the two numbers
// The greatest common divisor is the largest positive integer that can
// fully divide each of the integers (without leaving a remainder).

//    // MY VERSION -- INCORRECT!!

//public class GreatestCommonDivisor {
//    public static int getGreatestCommonDivisor (int first, int second) {
//        if (first < 10 || second < 10) {
//            return -1;
//        } else  if ((first % 2 == 0) && (second % 2 == 0));
//            return first;
//        }
//    }

// TEACHER VERSION

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int divisor = 0;
        for(int i = 1; i < first || i < second; i++){
            if(first % i == 0 && second % i == 0){
                divisor = i;
            }
        }
        return divisor;
    }
}