package academy.learnprogramming;

public class Dog extends Animal {
    // when creating a class that extends another one we must
    // need to be able to call constructor from the other class to
    // initialize it.
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    // the above are specific to a dog, but not an animal


//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
        // here I selected constructor and intelliJ created
        // the constructor above.
        // The super class is the part that uses the extends
        // Dog is based on animal class, but can add more unique characteristics
        // of a Dog in Dog class.
//    }
    // instead of above do:
    public Dog(String name, int size, int weight, int eyes, int legs,
               int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
        // The above has now initialized all the characteristics of Animal
        // class and Dog class in the Dog class.
    }

    private void chew() {
        // this method will be unique to Dog class only
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        // Click genereate override method - select method that want
        // to use in dog class. Now both animal and Dog have their own
        // methods
        System.out.println("Dog.eat() called");
        // this will output: Dog.eat() called
        chew();
        // this will output: Dog.chew() called
        super.eat();
        // this will automatically look for the super class then go back
        // to Animal class where method lives.
        // the above will output: Animal.eat() called.
    }
    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
        // this is saying do not look in current class
        // super means only execute the move method in super class.
    }
    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
