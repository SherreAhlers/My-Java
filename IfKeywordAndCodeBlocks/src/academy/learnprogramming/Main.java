package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score == 5000) {
//            System.out.println("Your score was 5000!");
//        }
        // Or like this:
//        if (score == 5000)
//            System.out.println("Your score was 5000!");
        // if do it like above you can only put one statement in if statement
        // if want more statements need code block above.
        // this will output: Your score was 5000!    because the above statement is true

//        if (score < 5000) {
//            System.out.println("Your score was less than 5000.");
//            // this will not output because if statement is false
//        } else {
//            System.out.println("Got here.");
//            // will output: Got here.    because if statement was false so then it ran the else statement
//
//        }

        // can also do:
        if (score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000 but greater than 1000.");
            // this will not output because if statement is false
        } else if (score < 1000) {
            System.out.println("Your score is less than 1000");
            // this will output: nothing because else if statement was false
        } else {
            System.out.println("Got here.");
            // will output: Got here.    because if statement was false so then it ran the else statement

        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            // this will output: Your final score was 5500
            // above a variable was created inside the code block - it will only be applicable to inside the code block, cannout use it outside of code block
            // you can access variable created outside the code block inside the code block but not the other way around.

        }

        // CHALLENGE
        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        // MY VERSION
        int secondScore = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            int finalScore2 = secondScore + (levelCompleted2 * bonus2);
            System.out.println("Your final score was " + finalScore2);
        }

        // TEACHER VERSION
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (gameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
            // the output will be: Your final score was 11600
        }

        // or could do: not as useful as above code... don't want to duplicate code.
//        newScore = 10000;
//        newLevelCompleted = 8;
//        newBonus = 200;
//
//        if(gameOver) {
//            int finalScore = score + (levelCompleted * bonus)
//            System.out.println("Your final score was " + finalScore);
//        }

    }
}
