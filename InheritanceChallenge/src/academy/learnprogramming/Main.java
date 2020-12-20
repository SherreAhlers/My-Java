package academy.learnprogramming;
// Class {@code Object} is the root of teh class hierarchy.
// Every class has {@code Object} as a superclass. All objects,
// including arrays, implement the methods of this class.
// Ex: its like writing
// public class Main extends Object{}
// like below but the below shows the implied above.
// They are automatically extended with Java.

public class Main {

    public static void main(String[] args) {
	// CHALLENGE
        // Start with a base class of Vehicle, the create a Car class
        // that inherits from this base class.
        // Finally, create another class, a specific type of Car that
        // inherits from the Car class.
        // You should be able to hand steering, changing gears, and
        // moving (speed in other words).
        // You will want to decide where to put the appropriate state and
        // behaviors (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed
        // should be included.
        // For you specific type of vehicle you will want to add something
        // specific for that type of car.
        Chevy chevy = new Chevy(36);
        // Car.setCurrentGear(): Changed to 3 gear.
        chevy.steer(45);
        // this will output: Vehicle.steer(): Steering at 45 degrees.
        chevy.accelerate(30);
        // this will output:
        // Car.changeVelocity(): Velocity 30 direction 0
        // Vehicle.move(): Moving at 30 in direction 0
        chevy.accelerate(20);
        // this will output: vehicle.move(): Moving at 50 in direction 45
    }
}
