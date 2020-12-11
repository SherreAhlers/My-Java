package academy.learnprogramming;

public class Main {

//    public static void main(String[] args) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        // no longer need above because they are parameters in calculateScore

//        calculateScore(true, 800, 5, 100);
        // this says once you get to this part, jump to code in calculateScore then go back to where you left off and keep running.

//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }

//        calculateScore(true, 10000, 8, 200);
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
        // these are no longer needed because we put them as parameters in calculateScore
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//            // this will output: Your final score was 11600
//        }
        // no longer need because we put parameters in calculateScore
        // code condensed from above to just code no comments
//        calculateScore(true, 800, 5, 100);
//        calculateScore(true, 10000, 8, 200);


        // cannot put a method inside another method, keep it inside public class area
//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // the void above means will not change or return
        // if want to return write like this:
//        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        // code without all the comments:
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//            // the output will be: Your final score was 2300  Your final score was 12600
//            System.out.println("Your final score was " + finalScore);
//            // this will output:
//            // if not using void above do
//            return finalScore;
//            // this will return even if not true
//        } else {
//            return -1;
//            // this means if the statement is true then return finalScore
//            // if not true return -1.
//            // -1 in programming means an error, in searching algorithms -1 means value not found or invalid.
//
//        }


        // can pass info into a method - tell method what parameters to send to it.
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        // these don't need to be created because we defined them as parameters in calculateScore

//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//            // the output will be: Your final score was 2300  Your final score was 12600
//        }
        // CHALLENGE
        //  create a method called displayHighScorePosition
        // it should return a player's name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the player's name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table "

        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is > 1000
        // 2 if the score is > 500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50
        public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position" + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
////        } else {
////            return 4;
////        }
//        }
//        return 4;
        // INSTEAD DO THIS
        int position = 4;  // assuming postion 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        // code without all the comments:
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            // the output will be: Your final score was 2300  Your final score was 12600
            System.out.println("Your final score was " + finalScore);
            // this will output:
            // if not using void above do
            return finalScore;
            // this will return even if not true
        } else {
            return -1;
            // this means if the statement is true then return finalScore
            // if not true return -1.
            // -1 in programming means an error, in searching algorithms -1 means value not found or invalid.

        }
    }
}
