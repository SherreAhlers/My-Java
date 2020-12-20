package academy.learnprogramming;

// MY VERSION

//public class Chevy extends Car {
//    private boolean isPowerSteering;
//    private String interior;
//
//    public Chevy(String body, String engine, int doors, int wheels,
//                 boolean isAutomatic, boolean isGas, String color, boolean isPowerSteering, String interior) {
//        super(body, engine, doors, wheels, isAutomatic, isGas, color);
//        this.isPowerSteering = isPowerSteering;
//        this.interior = interior;
//    }
//}

// TEACHER VERSION
public class Chevy extends Car {
    private int roadServiceMonths;

    public Chevy(int roadServiceMonths) {
        super("Chevy", "4WD", 5, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }
        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
