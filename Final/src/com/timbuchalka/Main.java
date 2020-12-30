package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // FINAL
        // they are not actually constants because they can be modified

        SomeClass one = new SomeClass("one");
        // this will output: one created, instance is 0
        SomeClass two = new SomeClass("two");
        // this will output: two created, instance is 0
        SomeClass three = new SomeClass("three");
        // this will output: three created, instance is 0

        System.out.println(one.getInstanceNumber());
        // this will output: 1
        System.out.println(two.getInstanceNumber());
        // this will output: 2
        System.out.println(three.getInstanceNumber());
        // this will output: 3

        System.out.println(Math.PI);
        // this would output: 3.141592653589793
//        Math m = new Math();
        // we are getting the error above because the Math class
        // Don't let anyone instantiate this class.
        // the Math was created as private

//        one.instanceNumber = 5;
        // this will not work because they were written as final
        // you cannot change the value of a final.

        // static final is more normal for constants -
        // static final - if value is constant and won't change
        // there is no need to store a copy in every class instance instead only store it once
        // using static final.
        // by marking a class final it will prevent your class from being subclassed.
//        int pw = 674312;
//        Password password = new Password(pw);
//        password.storePassword();
        // the above will not work instead it will output:
        // Saving password as 747902050
//        password.letMeIn(1);
        // this will output: Nope, you cannot come in!
        // -- because we did not put in the correct password
//        password.letMeIn(523266);
        // this will output: Nope, you cannot come in!
        // -- because we did not put in the correct password
//        password.letMeIn(9773);
        // this will output: Nope, you cannot come in!
        // -- because we did not put in the correct password
//        password.letMeIn(0);
        // this will output: Nope, you cannot come in!
        // -- because we did not put in the correct password
//        password.letMeIn(-1);
        // this will output: Nope, you cannot come in!
        // -- because we did not put in the correct password
//        password.letMeIn(674312);
        // this will output: Welcome!

        int pw = 674312;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(1);
        // this will output: Nope, you cannot come in!
        password.letMeIn(523266);
        // this will output: Nope, you cannot come in!
        password.letMeIn(9773);
        // this will output: Nope, you cannot come in!
        password.letMeIn(-1);
        // this will output: Nope, you cannot come in!
        password.letMeIn(674312);
        // this will output: Welcome!
        System.out.println("Main method called.");
        // this will output: Main method called.
        SIBTest test = new SIBTest();
        // this will output:
        // SIBTest static initialization block called.
        // 2nd initialization block called.
        // SIB constructor called.
        test.someMethod();
        // this will output: someMethod called.
        System.out.println("Owner is " + SIBTest.owner);
        // this will output: Owner is Sherre



    }
}
