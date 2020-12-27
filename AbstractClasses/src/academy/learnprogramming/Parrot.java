package academy.learnprogramming;

public class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }

//    @Override
//    public void fly() {
//        System.out.println("Flying from branch to branch");
//        // Parrot is automatically inheriting eat() and breathe()
//        // from Bird.
//    }
    // we got rid of above because it is now being inherited
    // from Bird automatically.


}
