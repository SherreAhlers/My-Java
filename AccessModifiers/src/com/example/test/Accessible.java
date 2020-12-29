package com.example.test;

// CHALLENGE
// In the following interface declaration, what is the visibility of:

// 1. the Accessible Interface?
// its set to Package-Private - accessible to all classes in the com.example.test package set above.

// 2. the int variable SOME_CONSTANT?
// its set to public - all interface variables are public static final

// 3. methodA?
// public

// 4. methodB and methodC?
// public - all interface methods are always public

// HINT:
// think back to the lecture on interfaces before answering.

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}

// if interface itself is not visible outside the current
// package those methods will not be visible either.
// The lack of an access modifier means the default of package
// private except with interface variables which are always public.
