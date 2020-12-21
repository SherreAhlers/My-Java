package academy.learnprogramming;
// CHALLENGE
// We are going to go back to the car analogy.
// Create a base class called Car.
// It should have a few fields that would be appropriate for a generic
// car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and
// set wheels to 4, and engine to true.
// Cylinders and names would be passed parameters.

// Create some methods like startEngine, accelerate and brake.

// Show message for each in the base class.
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// Put all classes in teh one Java file Main.

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine() {
        return "Car -> startEngine()";
    }
    public String accelerate() {
        return "Car -> accerlerate()";
    }
    public String brake() {
        return "Car -> brake()";

    }
}
class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
//        return super.startEngine();
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
//        return super.accelerate();
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
//        return super.brake();
        return "Mitsubishi -> brake()";
    }
}
class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //        return super.startEngine();
//        return "Honda -> startEngine()";
        // OR
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        //        return super.accelerate();
//        return "Honda -> accelerate()";
        // OR
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        //        return super.brake();
//        return "Honda -> brake()";
        // OR
        return getClass().getSimpleName() + " -> brake()";
    }

}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //        return super.startEngine();
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        //        return super.accelerate();
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        //        return super.brake();
        return "Ford -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        // this will output: Car -> startEngine()
        System.out.println(car.accelerate());
        // this will output: Car -> accerlerate()
        System.out.println(car.brake());
        // this will output: Car -> brake()

        Chevy chevy = new Chevy(6, "Cruz LS");
        System.out.println(chevy.startEngine());
        // this will output: Chevy -> startEngine()
        System.out.println(chevy.accelerate());
        // this will output: Chevy -> accelerate()
        System.out.println(chevy.brake());
        // this will output: Chevy -> brake()

        Ford ford = new Ford(6, "F150");
        System.out.println(ford.startEngine());
        // this will output: Ford -> startEngine()
        System.out.println(ford.accelerate());
        // this will output: Ford -> accelerate()
        System.out.println(ford.brake());
        // this will output: Ford -> brake()

        Honda honda = new Honda(6, "Unknown");
        System.out.println(honda.startEngine());
        // this will output: Honda -> startEngine()
        System.out.println(honda.accelerate());
        // this will output: Honda -> accelerate()
        System.out.println(honda.brake());
        // this will output: Honda -> brake()

    }

}
