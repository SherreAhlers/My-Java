package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// INHERITANCE
        // Object oriented programming allows us to create classes
        // to inherit commonly used behavior from other classes.
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        // this will initialize the Dog.
        dog.eat();
        // this will output: Animal.eat() called.
        dog.walk();
        // this will output: Animal.move() called. Animal is moving at 5
        dog.run();
        // this will output: Animal.move() called. Animal is moving at 10



    }
}
