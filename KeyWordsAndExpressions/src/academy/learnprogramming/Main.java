package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // some words you cannot use are - because they are reserved keywords.
        // false, true, null

        // a mile is equal to 1.609344 kilometers
//        double kilometers = (100 * 1.609344);
//        // the above is a valid java expression
//        int highScore = 50;
//
//        if (highScore == 50) {
//            System.out.println("This is an expression!");
//            // the component above inside the {} is also an expression
//            // if statements are control statements
//        }

        // CHALLENGE
        // In the following code that I will type below, write down what parts of the code
        // are expressions

        int score = 100; // the part that is an expression is score = 100
        if (score > 99) { // the part that is an expression is score > 99
            System.out.println("You got the high score!"); // the part that is the expression is the "You got the high score!"
            // this will output: You got the high score because high score is greater than 99
            score = 0; // the expression in this line is score = 0
        }


    }
}
