package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        boolean isAlien = false;
//        if (isAlien == false)
//            System.out.println("It is not an alien!");
        // the above will output: It is not an alien!
        // on line 7 using = is an assignment variable
        // line 8 has two == so it is testing if the operands are equal or identical to eachother

        // if did the above like this:
//        boolean isAlien = false;
//        if (isAlien == true)
//            System.out.println("It is not an alien!");
        // this will not output anything because the output line will not run because the if is false.

        // if we added a second line of outputs:
//        boolean isAlien = false;
//        if (isAlien == true)
//            System.out.println("It is not an alien!");
//            System.out.println("And I am scared of aliens.");
        // this will output: And I am scared of aliens.
        // because the if evaluated to false so very next line doesn't run
        // but 3rd line will run.
        // the above needs a code block.

        // above should be written like this:
//        boolean isAlien = false;
//        if (isAlien == true) {
//            System.out.println("It is not an alien!");
//            System.out.println("And I am scared of aliens.");
//            // the above will output nothing because the if statement evaluates to false.
//         };
//
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
            // the above will output: It is not an Alien!  and And I am scared of aliens
            // because the if statement returns true
        };

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
            // the above is comparing topScore to 100 to see if identical
            // this will output: You got the high score!
        };


        if (topScore != 100) {
            System.out.println("You got the high score!");
            // the above is comparing if topScore is not equal to 100.
            // this will output: nothing because the above evaluates to false.
        };

        // can also do

        if (topScore > 100) {
            System.out.println("You got the high score!");
            // the above is comparing if topScore is greater than 100.
            // this will output: nothing because the above evaluates to false.
        };

        // Or can do:

        if (topScore >= 100) {
            System.out.println("You got the high score!");
            // the above is comparing if topScore is greater than or equal 100.
            // this will output: You got the high score!  because the above evaluates to true.
        };

        // Or can do:
        if (topScore <= 100) {
            System.out.println("You got the high score!");
            // the above is comparing if topScore is less than or equal 100.
            // this will output: You got the high score!  because the above evaluates to true because it is equal to 100.
        };

        int secondTopScore = 60;
//        if (topScore > secondTopScore && topScore < 100) {
//            System.out.println("Greater than second top score and less than 100");
//            // this says if the top score is > than secondTop score but also check if topScore is less than 100
//            // && is a logical and operator.
//            // both must be set to true to get the code output, if one is false and one is true will not return anything.
//            // this will output: nothing because one of the statements are false.
//        };
            // use extra parenthesis to make more readable
        //  if ((topScore > secondTopScore) && (topScore < 100)) {
        //      System.out.println("Greater than second top score and less than 100");
        // };
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
            // this will output: Either or both of the conditions are true  because at least one of the conditions are true
        };

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true.");
            // this will output: This is true.   because it evaluates to true
        };

//        boolean isCar = false;
//        if (isCar = true) {
//            System.out.println("This is not supposed to happen.");
//            // this will output: This is not supposed to happen
//            // because we are reassigning the variable instead of comparing with ==.
//        }
        // above should be:
        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen.");
            // this will output: nothing  because it is false
        }
        // OR do this:
//        boolean isCar = false;
//        if (!isCar) {
//            // the above test if isCar is not true because of the ! before the value
//            System.out.println("This is not supposed to happen.");
//            // this will output: This is not supposed to happen.
//        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        // ternary are the same as in javascript
        // first operand is testing condition is true or false,
        // second operand is what to assign the value if isCar is true
        // if false the third operand will be called.
        if (wasCar) {
            System.out.println("wasCar is true.");
            // the output will be: wasCar is true.
        }

    }
}
