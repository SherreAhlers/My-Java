package academy.learnprogramming;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i = 0; i < maxGears; i++) {
            addGear(i, i + 5.3);
        }
    }
    // doesn't make sense to talk about Gears outside of the GearBox
    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }
    public void addGear(int number, double ratio) {
        if((number > 0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
            // the above code is for building the gearBox but not actually using...
            // could work better in constructor above.
        }
    }
    public void changeGear(int newGear) {
        if((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }
    public double wheelSpeed(int revs) {
        if(clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }
    private class Gear {
        private int gearNumbers;
        private double ratio;

        public Gear(int gearNumbers, double ratio) {

            this.gearNumbers = gearNumbers;
            this.ratio = ratio;
            // the two above a referencing the gear not the gearbox
        }
        public double getRatio() {
            return ratio;
        }
        public double driveSpeed(int revs) {
            return revs *(this.ratio);
        }
    }
// we hide the gear class by making it private... only can access it
    // through GearBox - good example of encapsulation

}
