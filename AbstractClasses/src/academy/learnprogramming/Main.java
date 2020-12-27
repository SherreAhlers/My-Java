package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breath();
        // this will output: Breathe in, breathe out, and repeat.
        dog.eat();
        // this will output: Yorkie is eating.

//        Bird bird = new Bird("Parrot");
//        bird.breath();
        // this will output: Breathe in, breathe out, and repeat.
//        bird.eat();
        // this will output: Parrot is pecking.

        Parrot parrot = new Parrot("Australian ring neck");
        parrot.breath();
        // this will output: Breathe in, breathe out, and repeat.
        parrot.eat();
        // this will output: Australian ringneck is pecking.
        parrot.fly();
        // this will output: Flying from branch to branch

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
        // this will output:
        // Emperor is flapping its wings.
        // I am not very good at that,
        // I am going for a swim instead.

    }
}
