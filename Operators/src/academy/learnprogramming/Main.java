package academy.learnprogramming;

import com.sun.source.tree.BreakTree;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        // here we have two operators the equals is an assignment operator
        // the + is the statement operator
        System.out.println("1 + 2 = " + result);
        // this will output: 1 + 2 = 3
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        // this will output: previousResult = 3
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        // this will output: 3 - 1 = 2

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);
        // this will output: 2 * 10 = 20

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);
        // this will output: 20 / 5 = 4

        // modulus operator (remainder operator)
        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);
        // the output is: 4 % 3 = 1  the one is the remainder of the equation above

        // result = result + 1;
        // can abbreviate the above statement:
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);
        // this will output: 1 + 1 = 2

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);
        // this will output:  2 - 1 = 1

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println(" 1 + 2 = " + result);
        // this will output: 1 + 2 = 3

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);
        // this will output: 3 * 10 = 30

        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);
        // this will output: 30 / 3 = 10

        // result = result - 2
        result -= 2;  // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);
        // this will output: 10 - 2 = 8

    }
}
