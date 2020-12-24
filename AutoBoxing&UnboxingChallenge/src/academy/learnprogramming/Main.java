package academy.learnprogramming;

public class Main {
    // CHALLENGE
    // Your job is to create a simple banking application.
    // There should be a Bank class.
    // It should have an ArrayList of Customers.
    // The Customer class should have an ArrayList of Doubles
    // (transactions).
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction
    // amount.
    // Also needs to add additional transactions for that customer/
    // branch.
    // Bank:
    // Add a new branch.
    // Add a new customer to that branch with initial transaction.
    // Add a transaction for an existing customer for that branch.
    // Show a list of customers for a particular branch and optionally
    // a list of their transactions.
    // Demonstration of autoboxing and unboxing in your code.
    // HINT:
    // Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions.


    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Sherre", 50.05);
        bank.addCustomer("Adelaide", "Cameron", 175.34);
        bank.addCustomer("Adelaide", "Rhonda", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Dan", 150.54);

        bank.addCustomerTransaction("Adelaide", "Sherre", 44.22);
        bank.addCustomerTransaction("Adelaide", "Sherre", 12.44);
        bank.addCustomerTransaction("Adelaide", "Cameron", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist.");
        }
        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists.");
        }
        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch.");
        }
        if(!bank.addCustomer("Adelaide", "Sherre", 12.21)) {
            System.out.println("Customer Sherre already exists.");
        }
    }
    // all of the above will output:
    // Customer details for branch Adelaide
    // Customer: Sherre[0]
    // Transactions
    // [0] Amount 50.05
    // [1] Amount 44.22
    // [2] Amount 12.44
    // Customer: Cameron[1]
    // Transactions
    // [1] Amount 175.34
    // [2] Amount 1.65
    // Customer: Rhonda[2]
    // Transactions
    // [2] Amount 220.12
    // Customer details for branch Sydney
    // Customer: Dan[0]
    // Transactions
    // [0] Amount 150.54
    // Adelaide branch already exists.
    // Customer does not exist at branch.
    // Customer Sherre already exists.
}
