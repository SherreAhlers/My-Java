package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
        // Instead of above do:

        // SWITCH STATEMENTS
        // only test one variable with different values.
        int switchValue = 4;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
                // this will run and after the 1 will break and go to rest of code below
            case 2:
                System.out.println("Value was 2");
                break;
                // breaks are vital to finishing the statement... will continue on to other code without a break

            case 3: case 4: case 5:
                System.out.println("Was a 3, 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                // this will output: Actually it was a 4   -- because I set value at 4

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
//                break;
                // don't need the above break but it is good practice to add the end break.

        }

        // CHALLENGE
        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for
        // A, B, C, D, or E
        // Display message if any of these are found and then break
        // Add a default which displays a message saying not found.

        // MY VERSION - WORKS

        char charSwitchValue = 'F';

        switch(charSwitchValue) {
            case 'A':
                System.out.println("Value was A");
                break;

            case 'B':
                System.out.println("Value was B");
                break;

            case 'C':
                System.out.println("Value was C");
                break;

            case 'D':
                System.out.println("Value was D");
                break;

            case 'E':
                System.out.println("Value was E");
                break;

            default:
                System.out.println("Character not found");
        }
        // TEACHER VERSION
        char charValue = 'A';
        switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");

                // the switch statement is case sensitive - need to be precise.

        }
    }
}
