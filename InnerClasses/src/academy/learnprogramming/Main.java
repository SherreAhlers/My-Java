package academy.learnprogramming;

import java.util.PropertyResourceBundle;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    // this is how we print
    private static Button btnPrint = new Button("Print");
    // this is declaring the button called Print

    public static void main(String[] args) {
        // this one is not done in local instead this was done by
        // using an anonymous class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });
                listen();
    }
    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}

// this is done with a local representation of clickListener
//public class Main {
//    private static Scanner scanner = new Scanner(System.in);
//    // this is how we print
//    private static Button btnPrint = new Button("Print");
//    // this is declaring the button called Print
//
//    public static void main(String[] args) {
//
//        class ClickListener implements Button.OnClickListener {
//            // here we are creating a local class that implements that
//            // OnClickListener interface that will assign that Click method.
//            public ClickListener() {
//                // this is my constructor
//                System.out.println("I've been attached.");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked.");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());
//        listen();
//    }
//    private static void listen() {
//        boolean quit = false;
//        while(!quit) {
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 0:
//                    quit = true;
//                    break;
//                case 1:
//                    btnPrint.onClick();
//            }
//        }
//    }
//}

// this is how we attach the method to the field.

        // local class = inner class defined inside a scoped method
        // used less often and increase encapsulation because only in
        // block of code
        // static nested class - used to associate a class with its
        // outer class - identical to top level class but the difference is its packaged in outerclass
        // non static nested class -
        // anonymous class - unnamed class

//        GearBox mcLaren = new GearBox(6);
//        GearBox.Gear first = mcLaren.new Gear(1, 12.3);
        // we used GearBox.Gear because Gear is an inner class to GearBox
        // then use the created variable mcLaren.new for inner classes

        // CANNOT DO:
//        GearBox.Gear second = new GearBox.Gear(2, 15.4);
        // this will not work because its an enclosed class must do like on
        // line 12.
        // ALSO CANNOT DO:
//        GearBox.Gear third = new mcLaren.Gear(3, 17.8);
        // because of the innerclass you must declare mcLaren.new Gear...
//        System.out.println(first.driveSpeed(1000));
        // this will output: 12300.0

//        GearBox mcLaren = new GearBox(6);
//        mcLaren.addGear(1, 5.3);
//        mcLaren.addGear(2, 10.6);
//        mcLaren.addGear(3, 15.9);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
        // this will output: Gear 1 selected.
//        mcLaren.operateClutch(false);
        // this will output: Grind!
//        System.out.println(mcLaren.wheelSpeed(1000));
        // this will output: 0.0
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
        // this will output: Gear 3 selected.
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));
        // this will output: 95400.0
