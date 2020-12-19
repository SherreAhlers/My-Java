package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // CONSTRUCTORS
        // CHALLENGE
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer
        // name, email and phone number.

        // Create getters and setters for each field.
        // Create two additional methods:
        // 1. To allow customer to deposit funds (this should
        // increment the balance field).
        // 2. To allow the customer to withdraw funds. This should
        // deduct from the balance field, but not allow the withdrawal
        // to complete if there are insufficient funds.
        // You will want to create various code in the Main class (the
        // one created by IntelliJ) to confirm your code is working.
        // Add some System.out.println()'s in the two methods above as
        // well.

//        BankAccount bobsAccount = new BankAccount();
        // to make the fields in constructor add parameters to code instead of above...
        BankAccount bobsAccount = new BankAccount("12345", 0, "Bob Brown",
                "myemail@bob.com", "(210) 123-4567");
        // since did above below is now redundant and not needed.
        System.out.println(bobsAccount.getAccountNumber());
        // this will output: 12345
        System.out.println(bobsAccount.getBalance());
        // this will output: 0.0

//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(0);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhoneNumber("(210) 123-4567");

        // the above is setting those fields to the above criteria... this can be
        // tedious with a lot of code --- instead use constructors...
        // A constructor is created for you by Java -- this happens when we type
        // new BankAccount() in the class...

        bobsAccount.withdrawFunds(100.00);
        // this will output: Only 0.0 available. Withdrawal not processed
        bobsAccount.depositFunds(50.00);
        // this will output: Deposit of 50.0 made. New balance is 50.0
        bobsAccount.withdrawFunds(100.00);
        // this will output: Only 50.0 available. Withdrawal not processed

        bobsAccount.depositFunds(51.00);
        // this will output: Deposit of 51.0 made. New balance is 101.0
        bobsAccount.withdrawFunds(100.00);
        // this will output: Withdrawal of 100.0 processed. Remaining balance 1.0
    }

}
