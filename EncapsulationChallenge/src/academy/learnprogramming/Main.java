package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// CHALLENGE
        // Create a class and demonstrate proper encapsulation
        // techniques.
        // The class will be called Printer.
        // It will simulate a real Computer Printer.
        // It should have fields for the toner Level, number of pages
        // printed, and also whether its a duplex printer (capable
        // of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%)
        // another method to simulate printing a page (which should
        // increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything
        // else you think is needed.

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        // this will output: Initial page count = 0
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " " +
                "new total print count for printer = " + printer.getPagesPrinted());
        // this will output:
        // Pages printed was 2 new total print count for printer = 2
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " " +
                "new total print count for printer = " + printer.getPagesPrinted());
        // this will output:
        // Pages printed was 1 new total print count for printer = 3


        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        // this will output: Initial page count = 0
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " " +
                "new total print count for printer = " + printer.getPagesPrinted());
        // this will output:
        // Pages printed was 4 new total print count for printer = 4
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " " +
                "new total print count for printer = " + printer.getPagesPrinted());
        // this will output:
        // Pages printed was 2 new total print count for printer = 6

    }
}
