// CHALLENGE
// Write a method called inputThenPrintSumAndAverage that does not
// have any parameters.
// The method should not return anything (void) and it needs to keep
// reading int numbers from the keyboard.
// When the user enters something that is not an int then it needs to
// print a message in the format "SUM = XX AVG = YY"
// XX represents the sum of all entered numbers of type int.
// YY represents the calculated average of all numbers of type long.

// TIP:
// Use Scanner to read an input from the user.
// Use casting when calling the round method since it needs double
// as a parameter.
// Use the method Math.round to round the calculated average (double)
// The method round returns long.


import java.util.Scanner;

public class InputCalculator {
    // MY VERSION -- INCORRECT

//    public static void inputThenPrintSumAndAverage () {
//    double avg = 0;
//    int sumOfNumbers = 0;
//    int sum = 0;
//    while(true) {

//    }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number:");
//
//    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double avg = 0;
        int sumOfNumber = 0;
        int sum = 0;
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                sumOfNumber++;
                sum += scanner.nextInt();
                avg = (double)  sum / sumOfNumber;
            }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = "+sum+" AVG = "+Math.round(avg));
        scanner.close();
    }
    // OR LIKE THIS:

//    public static void inputThenPrintSumAndAverage() {
//        Scanner keyboard = new Scanner(System.in);
//        int count = 0;
//        int sum = 0;
//        while(true){
//            // count++;
//            boolean hasNextInt = keyboard.hasNextInt();
//            if (hasNextInt) {
//                int numbers = keyboard.nextInt();
//                sum = sum + numbers;
//                count++; // move here so it doesn't increment for non-int value
//            } else {
//                break;
//            }
//        }
//        double roundedAvg = (Math.round((double) sum / (double) count));
//        long avg = (long) roundedAvg;
//
//        System.out.println("SUM = " + sum + " AVG = " + avg);
//        keyboard.close();
//    }
}
