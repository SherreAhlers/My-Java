package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        // this will output: Float minimum value = 1.4E-45
        System.out.println("Float maximum value = " + myMaxFloatValue);
        // this will output: Float maximum value = 3.4028235E38

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        // this will output: Double minimum value = 4.9E-324
        System.out.println("Double maximum value = " + myMaxDoubleValue);
        // this will output: Double maximum value = 1.7976931348623157E308
//
//        int myIntValue = 5;
//        float myFloatValue = 5.25f;
//        // these must end in f - more popular way
////        float myFloatValue = (float) 5.25;
//        // the above must put (float) first because there is no f at the end... less recommended approach
//        double myDoubleValue = 5.25d;
//        // these must end with d
//        System.out.println("MyIntValue = " + myIntValue);
//        // this will output: MyIntValue = 5
//        System.out.println("MyFloatValue = " + myFloatValue);
//        // this will output: MyFloatValue = 5.25
//        System.out.println("My DoubleValue = " + myDoubleValue);
//        // this will output: My DoubleValue = 5.25

//        int myIntValue = 5 /2;
//        float myFloatValue = 5f / 2f;
//        // these must end in f - more popular way
////        float myFloatValue = (float) 5.25;
//        // the above must put (float) first because there is no f at the end... less recommended approach
//        double myDoubleValue = 5d / 2d;
//        // these must end with d
//        System.out.println("MyIntValue = " + myIntValue);
//        // this will output: MyIntValue = 2
//        System.out.println("MyFloatValue = " + myFloatValue);
//        // this will output: MyFloatValue = 2.5
//        System.out.println("My DoubleValue = " + myDoubleValue);
//        // this will output: My DoubleValue = 2.5

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        // these must end in f - more popular way
//        float myFloatValue = (float) 5.25;
        // the above must put (float) first because there is no f at the end... less recommended approach
        double myDoubleValue = 5d / 3d;
        // these must end with d
        System.out.println("MyIntValue = " + myIntValue);
        // this will output: MyIntValue = 2
        System.out.println("MyFloatValue = " + myFloatValue);
        // this will output: MyFloatValue = 1.6666666
        System.out.println("My DoubleValue = " + myDoubleValue);
        // this will output: My DoubleValue = 1.6666666666666667
        // DOUBLES are more precise
        // Java will automatically assume a decimal number is a double so don't necesarily need to follow number with a d.
        // Floats are not as good as double

        // Challenge
        // My version
        int poundsVariable = 200;
        double doubleVariable = .45359237;
        double resultsVariable = doubleVariable * poundsVariable;
        System.out.println(resultsVariable);
        // the output will be: 90.718474

        // Teacher version
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);
        // this will output: Converted kilograms = 90.718474

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        // the underscores take the place of ,
        System.out.println(pi);
        // this will output: 3.1415927
        System.out.println(anotherNumber);
        // this will output: 3000000.456789


    }
}
