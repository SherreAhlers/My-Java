package academy.learnprogramming;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
//        super(name, brain, body, size, weight);
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
        // This fish class inherits from animal class.
    }
    private void rest() {

    }
    private void moveMuscles() {

    }
    private void moveBackFin() {

    }
    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
        // calling super from Animal class and using the Animal class
        // method of move();
    }
}
