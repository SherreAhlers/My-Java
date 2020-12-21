package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// MASTER CHALLENGE
        // The purpose of the application is to help a fictitious
        // company called Bills Burgers to manage their process of
        // selling hamburgers.
        // Our application will help Bill to select types of burgers,
        // some of the additional items (additions) to be added to
        // the burgers and pricing.
        // We want to create a base hamburger, but also two other
        // types of hamburgers that are popular ones in Bill's store.
        // The basic hamburger should have the following items:
        // Bread roll type, meat and up to 4 additional (things like
        // lettuce, tomato, cheese, pickles, onions, etc) that the customer
        // can select to be added to the burger.
        // Each one of these items gets charged an additional price
        // so you need some way to track how many items got added
        // and to calculate the final price (base burger with all
        // the additions).
        // This burger has a base price and the additions are all
        // separately priced (up to 4 additions, see above).
        // Create a Hamburger class to deal with all the above.
        // The constructor should only include the roll type, meat, and
        // price, can also include the name of burger or you can use a
        // setter.
        // Also create two extra varieties of Hamburgers (subclasses) to
        // cater for
        // a) Healthy burger (on a brown tye bread roll), plus two additional
        // items that can be added.
        // The healthy burger can have 6 items (Additions) in total.
        // HINT:
        // You probably want to process the two additional items in this
        // new class (subclass of Hamburger). not the base class (Hamburger)
        // since the two additions are only appropriate for this new class
        // (in other words new burger type).
        // b) Deluxe hamburger - comes with chips and drinks as additions,
        // b ut no extra additions are allowed.
        // HINT:
        // You have to find a way to automatically add these new
        // additions at the time the deluxe burger object is created,
        // and then prevent other additions being made.
        // All 3 classes should have a method that can be called anytime
        // to show the base price of the hamburger plus all the additional,
        // each showing the addition name, and addition price, and grand/final
        // total for the burger (base price + all additions).
        // For the two additional classes this may require you to be
        // looking at the base class for pricing and then adding totals
        // to final price.

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        // this will output: hamburger  on a White roll withSausage, price is 3.56
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());
        // this will output:
        // Added Tomato for an extra 0.27
        // Added Lettuce for an extra 0.75
        // Added Cheese for an extra 1.12
        // Total burger price is 1.12

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
//        healthyBurger.itemizeHamburger();
        // this will output:
        // hamburger  on a Brown rye roll withBacon, price is 5.67
        // Added Egg for an extra 5.43
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());
        // this will output:
        // Added Egg for an extra 5.43
        // Added Lentils for an extra 3.41
        // Total Healthy Burger price is 8.84

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        // this will output:
        // Added Chips for an extra 2.75
        // Added Drink for an extra 1.81



    }
}
