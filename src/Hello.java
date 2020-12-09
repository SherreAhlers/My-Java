public class Hello {

    public static void main(String[] args) {
        // public is an access modifier we discussed when defining the class.
        // static is a Java keyword that needs an understanding of other concepts, for now, know that we need to have static
        // for Java to find our method to run the code we are going to add.
        // void is yet another Java keyword used to indicate that the method will not return anything.
        // the left and right parenthesis in a method declaration are mandatory and can optionally include one or more parameters
        // which is a way to pass information to a method.
//        System.out.println("Hello, Sherre");
        // must have semi colon to end statement or will get an error.
        // int myFirstNumber = 5;

        // VARIABLES
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
        // above we defined a variable of int - integer (whole number), then named variable myFirstNumber, then the equals operator to have a value of 5, and the semi colon ends the statement.
        // above we are declaring a variable of type int with the name myFirstNumber and assigning the value of 5 to it.
        // variables must be initialized before use. anything to the right of the equal sign as an expression in Java

    }
}
// exit code 0 means everything was executed properly

// code block is used to define a block of code. Its mandatory to have one in a method declaration and its here where we will be adding statements to perform certain tasks.

// statement - this is a complete command to be executed and can include one or more expressions.

// text in " " string is a  - literal string
