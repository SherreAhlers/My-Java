package academy.learnprogramming;

import java.security.acl.LastOwnerException;

public class Main {

    public static void main(String[] args) {
	// COMPOSITION - look at composition before inheritance!
        // modeling parts of a greater whole
        Dimensions dimensions = new Dimensions(20, 20 ,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27in Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        // here we have created the PC class by passing 3 objects to it
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
        // in the above code we are accessing the functions in the base classes
        // accessing them by the PC object.
        // passing the above to constructor then they get put together to
        // create the whole computer.
        thePC.powerUp();
        // This will output: Drawing pixel at 1200,50 in color green

        // CHALLENGE
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room
        // Maybe physical parts of the house but furniture as well.
        // Add at least one method to access an object via getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hid the object e.g. not using
        // a getter but to access the object used in composition within the
        // main class like you saw in this video.

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2,
                1);

        Lamp lamp = new Lamp("Classic", false,
                75);


        Bedroom bedroom = new Bedroom("Sherre's", wall1,
                wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        // this will output: Bed -> Making
        bedroom.getLamp().turnOn();
        // this will output: Lamp -> Turning on

    }
}
