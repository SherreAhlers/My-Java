package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // system.out.println() dumps data into console.
        // type Scammer is Java class allows you to type input into
        // console and return it back to program - system.in
        // allows us to read user input
        // new Scanner allows us to create a new instance of Scanner
        // creating a new object of type of scanner.
        System.out.println("Enter your year of birth:");
        // this will output:
        // Enter your year of birth:
        // 1984

        boolean hasNextInt = scanner.hasNextInt();
        // the above checks to see if next input entered is a number
        // will not remove it from the scanner.
        // if it doesn't qualify as an int the method will return false.
        // We need to check to see if hasNextInt is true...
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            // what user types will convert to int instead of string
            // must call nextLine() again so scanner works as expected
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");
            // this will output:
            // Enter your name:
            // Sherre
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;
            // this will calculate year of birth based on user input
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
                // This will output: Invalid year of birth if the above is false.
            }

        } else {
            System.out.println("Unable to parse year of birth.");
            // this will output: Unable to parse year of birth.
            // if user input was not a int.
        }
        // recommended to close scanner once don't need anymore.
        scanner.close();
    }
}
