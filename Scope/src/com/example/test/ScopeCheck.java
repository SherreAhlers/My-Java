package com.example.test;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar +
                ": privateVar = " + varOne);
        // this will output: ScopeCheck created, publicVar = 0: privateVar = 1
    }

    public int getVarOne() {
        return varOne;
    }
    public void timesTwo() {
        int varTwo = 2;
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
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
            // i is only accessible within this block of code.

//            System.out.println(i + " times two is " + i * this.varTwo);
            // using this.varTwo will call the variable at the top instead
            // of the variable inside the code block like above.
        }
    }
    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    public class InnerClass {
        public int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne + " and varThree is " + varThree);
            // this will output: InnerClass created, privateVar is 3
        }
        public void timesTwo() {
//            int privateVar = 2;
            // with this removed it will output:
            // InnerClass created, privateVar is 3
            // 0 times two is 0
            // 1 times two is 3
            // 2 times two is 6
            // 3 times two is 9
            // 4 times two is 12
            // 5 times two is 15
            // 6 times two is 18
            // 7 times two is 21
            // 8 times two is 24
            // 9 times two is 27
            System.out.println("varOne is still available here " + varOne);
            for(int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * varThree);
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

                // if want to use the variable at the top and not one in code block
                // would have to write:
//                System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);
                // this would output:
                // 0 times two is 0
                // 1 times two is 3
                // 1 times two is 1
                // 2 times two is 6
                // 2 times two is 2
                // 3 times two is 9
                // 3 times two is 3
                // 4 times two is 12
                // 4 times two is 4
                // 5 times two is 15
                // 5 times two is 5
                // 6 times two is 18
                // 6 times two is 6
                // 7 times two is 21
                // 7 times two is 7
                // 8 times two is 24
                // 8 times two is 8
                // 9 times two is 27
                // 9 times two is 9


            }
        }
    }
}
