package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Sherre", 500);
        System.out.println("New score is " + newScore);
        // this will output: New score is 500000
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);
        // this will output: 6.0 feet, 0.0 inches = 182.88 cm
        calcFeetAndInchesToCentimeters(7, 5);
        // this will output: 7.0 feet, 5.0 inches = 226.06 cm
        calcFeetAndInchesToCentimeters(-10, 5);
        // this will output: Invalid feet or inches parameter
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(100);
        // this will output: 100.0 inches is equal to 8.0 feet and 4.0 inches
        calcFeetAndInchesToCentimeters(157);
        // this will output: 157.0 inches is equal to 13.0 feet and 1.0 inches

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        // this will output: Player Sherre scored 500 points
        return score * 1000;
    }

    // METHOD OVERLOADING
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        // this will output: Unnamed player scored 75 points
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score ");
        // this will output: No player name, no player score
        return 0;
    }

    // CHALLENGE
    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // feet is the first parameter, inches is the second parameter
    //
    // You should validate the first parameter feet is >= 0
    // You should validate the second parameter inches is >= 0 and <= 12
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimeters
    // comprise the feet and inches passed to this method and return
    // that value
    //
    // Create a 2nd method of the same name but with only one parameter
    //inches is the parameter
    // validate that its >= 0
    // return -1 if it is not true
    // But if its valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call the other overloaded method passing the correct feet and inches
    // calculated so that is can calculate correctly.
    // hints: Use double for your number data types is probably a good idea
    // 1 inch = 2.54cm and one foot = 12 inches
    // use the link I gave you confirm your code is calculating correctly.
    // Calling another overloaded method just requires you to use the right number of parameters

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches < 12)) {
            System.out.println("Invalid feet or inches parameter");
            return -1;
            // the reason we are returning -1 here is a way to test if calculations are correct.
            // negative one is common for testing errors in code.
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        // this will output: 6.0 feet, 0.0 inches = 182.88 cm
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        // this will output: 100.0 inches is equal to 8.0 feet and 4.0 inches
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

