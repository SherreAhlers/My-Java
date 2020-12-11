package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50;
        // what is a statememnt? above is the entire line
        // int myVariable = 50;   which is known as an assignment variable
        myVariable++;
        // the above is a complete statement
        myVariable--;
        // the above is a complete statement
        System.out.println("This is a test.");
        // this will output: This is a test.
        // the above is also a complete statement
        // statements can take up more than one line.
        // EX:
        // System.out.println("This is" +
        // " another" +
        // " still more.");
        // can break the above into multiple lines if don't add semi-colon until the end of the whole statement

        int anotherVariable = 50; myVariable--; System.out.println("This is another one.");
        // the above is a valid line... can add multiple statements to one line.
        // will output: This is another one.

        // Java will ignore whitespace in code.
        // EX:
        // int      myVariable       = 50    ;
        // the above will still work because Java will delete the whitespace


        // Indenting makes the code more readable.
        // if indenting is messed up  click COMMAND + OPTION + L
    }

}
