package academy.learnprogramming;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // example of constructor
    public BankAccount() {
        this("56789", 2.5, "Default name", "Default address", "Default phone");
        // the above are default if there are no values for each parameter.
        System.out.println("Empty constructor");
        // below where we called new BankAccount() it will come to above code since
        // we made a constructor
        // can have more than one constructor as long as change number of parameters
    }
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("BankAccount constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        // the above sets the field values inside the constructor.
    }
    // can add constructors with intelliJ
    // click code at top - click generate - select constructor - will ask which fields to use.


    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    // the above is not needed because I set the defaults above as parameters.

    public void depositFunds(double depositAmount) {
//        int deposits = balance + depositFunds();
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if(balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
//            return balance - withdrawFunds();
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance " + this.balance);
        }
    }
    // to generate quick getters or setters: click code menu
    // click generate - click getter, setter or getter and setter
    // can select more than one field - click ok and intelliJ will
    // create all getters and setters seen below.

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
