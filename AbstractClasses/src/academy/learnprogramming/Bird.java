package academy.learnprogramming;

//public class Bird extends Animal {
//    public Bird(String name) {
//        super(name);
//    }
//
//    @Override
//    public void eat() {
//        System.out.println(getName() + " is pecking.");
//    }
//
//    @Override
//    public void breath() {
//        System.out.println("Breathe in, breathe out, and repeat.");
//    }
//}
// OR LIKE THIS:
public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking.");
    }

    @Override
    public void breath() {
        System.out.println("Breathe in, breathe out, and repeat.");
    }
//    public abstract void fly();
    // this is an abstract class that is extending from another class.


    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings.");
    }
}
