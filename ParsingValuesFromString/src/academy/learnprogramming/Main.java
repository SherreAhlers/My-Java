package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
//        String numberAsString = "2018a";
//        String numberAsString = "2018.125"; / this one relates to line 16
        // the above wont work because the string has an invalid value for parsing
        // the a on the end.
        System.out.println("numberAsString = " + numberAsString);
        // this will output: numberAsString = 2018
        // we want to convert string to integer

        int number = Integer.parseInt(numberAsString);
//        double number = Double.parseDouble(numberAsString);
        // Using a class called Integer
        // can tell its a class because of the capital letter
        // parseInt will try to convert string we are passing into
        // an integer
        // in order to convert type String we use parseInt
        System.out.println("number = " + number);
        // this will output: number = 2018
        // parsing is used to turn String into number for calculations

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        // this will output: numberAsString = 20181
        // this is because the numberAsString is a string so will add
        // value to end of string
        System.out.println("number = " + number);
        // this will output: number = 2019
        // because number was already type int so it added the value to
        // number.


    }
}
