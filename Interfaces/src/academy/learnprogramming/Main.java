package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// INTERFACES
        // to use an interface to provide a common behavior that can be used my multiple classes
        // by having them all implement the same interface.
        ITelephone sherresPhone;
//        DeskPhone sherresPhone;
        // Both the above are valid but must use appropriate class.
        sherresPhone = new DeskPhone(2104265648);
        sherresPhone.powerOn();
        // this will output: Mobile phone powered up.
        sherresPhone.callPhone(123456);
        sherresPhone.answer();

        sherresPhone = new MobilePhone(24565);
        sherresPhone.powerOn();
        sherresPhone.callPhone(24565);
        sherresPhone.answer();

// a class can only inherit from one super class
        // but can implement from many interfaces
        // multiple inheritance is only available with interfaces
    }
}
