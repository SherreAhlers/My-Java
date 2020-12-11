package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // My Version - wrong! keep studying...
//        double doubleVariable = 20.00d;
//        double secondDoubleVariable = 80.00d;
//        double addedTogether = (doubleVariable + secondDoubleVariable) * 100.00d;
//        double sumAndModulus = addedTogether % 40.00;
//        boolean isNotZero = true;
//
//        if (sumAndModulus != 0) {
//            System.out.println("Got some remainder");
//        }

        // Teacher Version
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("myValuesTotal = " + myValuesTotal);
        // this will output: myValuesTotal = 10000.0
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        // this will output: theRemainder = 0.0
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        // this will output: isNoRemainder = false
        if (!isNoRemainder) {
            System.out.println("Got some remainder.");
            // this will output: isNoRemainder = true
        }
    }
}
