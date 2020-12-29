package com.example.test;

public class Main {

    public static void main(String[] args) {

        Account sherresAccount = new Account("Sherre");
        sherresAccount.deposit(1000);
        // this will output: 1000 deposited. Balance is now 1000
        sherresAccount.withdraw(500);
        // this will output: 500 withdrawn. Balance is now 500
        sherresAccount.withdraw(-200);
        // this will output: Cannot withdraw negative sums.
        sherresAccount.deposit(-20);
        // this will output: Cannot deposit negative funds.
        sherresAccount.calculateBalance();
        // this will output: Calculated balance is 500

        System.out.println("Balance on account is " + sherresAccount.getBalance());
        // this will output: Balance on account is 500
    }
}
// the above can never be private because class is a top level
// only classes, interfaces, and enums can exist at the top level,
// everything else must be included within one of these

// public: the object is visible to all classes everywhere,
// whether they are in the same package or have imported
// the package containing the public class.
// At the member level, public has the same meaning as at top
// level. A public class member (or field) and public method can
// be accessed from any other class anywhere.

// Package-private: the object is only available within
// its own package (and is visible to evey class within the
// same package. Package-private is specified by not specifying,
// i.e. it is the default if you do not specify public. There
// is not a "package-private" keyword.
// This also has the same meaning as it does at the top level.
// An object with no access modifer is visible to every class
// within the same package (but not to classes in external
// packages).

// private: the object is only visible within the class it
// is declared in. It is not visible anywhere else (including
// subclasses of its class).

// Protected: the object os visible anywhere in its own package
// (like package-private) but also in subclasses even if they
// are in another package.
