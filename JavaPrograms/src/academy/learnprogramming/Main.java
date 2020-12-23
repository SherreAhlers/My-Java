package academy.learnprogramming;

import java.util.ArrayList;

class IntClass {
    private int myValue;
    public IntClass(int myValue) {
        this.myValue = myValue;
    }
    public int getMyValue() {
        return myValue;
    }
    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Sherre");

        // cannot do:

//        ArrayList<int> intArrayList = new ArrayList<int>();
        // because you cannot put primative types into arrays.
        // can do:
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        // but need to add a class like I've done on line 5.
        Integer integer = new Integer(54);
        // different between int and Integer is Integer is actually a class int is not
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
            // .valueOf takes primative type of i and converts it into a class
            // instead of a primative type.
        }
//        for(int i = 0; i <= 10; i++) {
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());
//            // this will output:
//            // 0 --> 0
//            // 1 --> 1
//            // 2 --> 2
//            // 3 --> 3
//            // 4 --> 4
//            // 5 --> 5
//            // 6 --> 6
//            // 7 --> 7
//            // 8 --> 8
//            // 9 --> 9
//            // 10 --> 10
//        }

//        Integer myInValue = Integer.valueOf(56);
        // or like this:
        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue.intValue(); // myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
            // autoboxing
        }
        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            // unboxing
            System.out.println(i + " --> " + value);
            // this will output:
            // 0 --> 0.0
            // 1 --> 0.5
            // 2 --> 1.0
            // 3 --> 1.5
            // 4 --> 2.0
            // 5 --> 2.5
            // 6 --> 3.0
            // 7 --> 3.5
            // 8 --> 4.0
            // 9 --> 4.5
            // 10 --> 5.0
            // 11 --> 5.5
            // 12 --> 6.0
            // 13 --> 6.5
            // 14 --> 7.0
            // 15 --> 7.5
            // 16 --> 8.0
            // 17 --> 8.5
            // 18 --> 9.0
            // 19 --> 9.5
            // 20 --> 10.0
        }
    }
}
