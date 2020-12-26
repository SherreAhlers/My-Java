package academy.learnprogramming;

public class GearBox {
    private boolean clutchIsIn;

//    public void operateClutch(String inOrOut) {
//        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
//    }
    // above is not best way to do it...

    // this is a better way to write the above -- problem would be if
    // anything else is using on the first parameter being a String
    // and we have changed it to a boolean -- will break code.
    public void operateClutch(boolean inOrOut) {
        // interface is a commitment that method signatures and
        // variables if created will not change.
        this.clutchIsIn = inOrOut;
    }
}
