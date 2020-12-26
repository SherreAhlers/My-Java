package academy.learnprogramming;

public class DeskPhone implements ITelephone {
    // inorder to use the interface you must use the implements ITelephone
    // on the class
    // can create empty methods
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }
    // click command + n  -- select Implement methods
    // all will be selected from the Interface we created and added here
    // in order to be a valid class these are the methods that must be added
    // if implementing Interface must use all methods listed in Interface.

    @Override
    public void powerOn() {
        System.out.println("No action takes, desk phone doesn't have a power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desk phone.");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the desk phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
