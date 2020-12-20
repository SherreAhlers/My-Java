package academy.learnprogramming;


// MY VERSION

//public class Car extends Vehicle {
//    private boolean isAutomatic;
//    private boolean isGas;
//    private String color;
//
//    public Car(String body, String engine, int doors, int wheels,
//               boolean isAutomatic, boolean isGas, String color) {
//        super(body, engine, doors, wheels);
//        this.isAutomatic = isAutomatic;
//        this.isGas = isGas;
//        this.color = color;
//    }
//}

// TEACHER VERSION
public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors,
               int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " +
                this.currentGear + " gear.");
    }
    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " +
                speed + " direction " + direction);
        move(speed, direction);

    }

}
