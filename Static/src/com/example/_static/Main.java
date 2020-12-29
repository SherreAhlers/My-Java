package com.example._static;

public class Main {
    public static int multiplier = 7;

    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number "
//        + StaticTest.getNumInstances());
//        // this will output: 1st Instance is instance number 1
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//        // this will output: 2nd Instance is instance number 2
//
//        StaticTest thirdInstances = new StaticTest("3rd Instance");
//        System.out.println(thirdInstances.getName() + " is instance number " + StaticTest.getNumInstances());
//        // this will output: 3rd Instance is instance number 3

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        // this will output: The answer is 42
        System.out.println("Multiplier is " + multiplier);
        // this will output: Multiplier is 7
        // the above 3 lines of code will not work if on line 4 static is not used

    }
    public static int multiply(int number) {
        return number * multiplier;
        // the above code only works because of the static in the statement
    }
}
