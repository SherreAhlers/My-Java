package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // CHALLENGE
        // create a byte variable and set it to any valid byte number.
        // create a short variable and set it to any valid short number.
        // create an int variable and set it to any valid int number.
        // create a variable of type long and make it equal to 50000 + 10 * the sum
        // of the byte plus the short plus the integer value

        // My Version
        byte byteVariable = 10;

        short shortVariable = 20;

        int intVariable = 50;

        long longVariable = (byteVariable + shortVariable + intVariable) * 10 + 50000;
        System.out.println(longVariable);
        // this will output: 50800

        // Teacher Version
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
        // this will output: 50800

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);
        // this will output: 1800
    }
}
