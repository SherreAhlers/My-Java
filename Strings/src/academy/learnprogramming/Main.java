package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // byte - can only range between -128 to 127 - will rarely use
        // short - rarely use
        // int - will use most of all
        // long - use when have long numbers
        // float - should use double instead
        // double -- should use more than float for accuracy
        // boolean -- yes, or no - true, or false - 0 or 1

        // STRING
        // not a primative type - is actually a class
        String myString = "This is my string.";
        System.out.println("myString is equal to " + myString);
        // this will output: myString is equal to This is my string.
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        // this will output: myString is equal to This is my string., and this is more.
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        // this will output: myString is equal to This is my string. © 2019
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        // this will output: 250.5549.95  because we are not using a numeric type we are using a string data type
        // would need to convert to another type for it to do calculations
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        // this will output: LastString is equal to 1050
        // will still configure and set up as a string so will convert the content of the int to the string then appends it to the string giving us 1050
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
        // this will output: LastString is equal to 1050120.47
        // so took last output of string at 1050 and appended the 120.47d to the end of the string still keeping it a string







    }
}
