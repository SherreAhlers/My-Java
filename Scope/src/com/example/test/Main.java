package com.example.test;

public class Main {
// visibility is connected to scope
    public static void main(String[] args) {
	// SCOPE
        // ex: walmart makes a discount - will only apply to walmart stores
        // that would be walmart is scope of discount
        String varFour = "this is private to Main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("varThree is not accessible here " + innerClass.varThree);
        // this will only work if use public int varThree = 3 inside the InnerClass {
        System.out.println("scopeInstance var1 is " + scopeInstance.getVarOne());
        // this will output: scopeInstance privateVar is 1
        System.out.println(varFour);
        // this will output: this is private to Main()

        scopeInstance.timesTwo();
        // this will output:
        // 0 times two is 0
        // 1 times two is 2
        // 2 times two is 4
        // 3 times two is 6
        // 4 times two is 8
        // 5 times two is 10
        // 6 times two is 12
        // 7 times two is 14
        // 8 times two is 16
        // 9 times two is 18
        System.out.println("***************");
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();
        // this will output:
        // InnerClass created, privateVar is 3
        // 0 times two is 0
        // 1 times two is 2
        // 2 times two is 4
        // 3 times two is 6
        // 4 times two is 8
        // 5 times two is 10
        // 6 times two is 12
        // 7 times two is 14
        // 8 times two is 16
        // 9 times two is 18
    }
}
