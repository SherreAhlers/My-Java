package com.timbuchalka;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
    // this no longer works because I added final to the statement in
    // Password class in the storePassword method.

}
// Static initialization blocks are more advanced and I probably won't work with it much

