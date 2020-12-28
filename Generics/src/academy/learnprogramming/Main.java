package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // GENERICS
        // generics are very useful
        // allow us to create classes, interfaces and methods that
        // take types as parameters - type parameters.

        // this example doesn't use generics
//        ArrayList items = new ArrayList();
//        items.add(1);
        // this will output: 2
//        items.add(2);
        // this will output: 4
//        items.add(3);
        // this will output: 6
//        items.add(4);
        // this will output: 8
//        items.add(5);
        // this will output: 10

//        printDoubled(items);
//    }
//    private static void printDoubled(ArrayList n) {
//        for(Object i : n) {
        // we used Object because we didn't specify above
//            System.out.println((Integer) i * 2);
        // we had to cast the above with Integer so it printed
        // out a number
        // this will output:
        // 2
        // 4
        // 6
        // 8
        // 10

//        }
        // EXAMPLE WITH GENERICS
        // when we add type parameter to a generic type
        // - called paramatized type - specified with angle brackets.
        ArrayList<Integer> items = new ArrayList<>();
        // we don't need to fill in the <> at the end of above because
        // we specified it to the left of the equals.
        items.add(1);
        // this will output: 2
        items.add(2);
        // this will output: 4
        items.add(3);
        // this will output: 6
        items.add(4);
        // this will output: 8
        items.add(5);
        // this will output: 10

        printDoubled(items);
    }
    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) {
            // we don't need the Object here because Java knows what
            // it is looking for.
            System.out.println( i * 2);
            // don't need to specify the Integer here because we
            // declared it in the ArrayList<Integer>
            // this will output:
            // 2
            // 4
            // 6
            // 8
            // 10
        }
    }

}

