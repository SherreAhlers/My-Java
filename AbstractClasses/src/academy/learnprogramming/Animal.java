package academy.learnprogramming;

public abstract class Animal {
    // can add fields
    // can add constructors
    // can specify that certain methods are abstract.
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    // abstract methods
    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }
    // we will inherit abstract class without
    // specifying how they are to be performed.
    // with abstract methods are forcing class that is going
    // to implement from abstract class
    // to create those methods for us - that is why they are
    // marked as abstract.
}
// Abstract class can have member variables that can be inherited
// interface cannot they must be static
// interface cannot have constructors but abstract classes can
// Abstract classes can have defined methods
// all methods in interface are abstract - no code in  abstract methods
// all code must be written in class.
