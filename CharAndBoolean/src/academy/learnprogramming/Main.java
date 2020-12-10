package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // CHAR
        char myChar = 'D';
        // the above would be relevant with wanting to save the last character that was clicked, etc
        // can only store one single character in each char inference
        char myUnicode = '\u0044';
        // the backslash u states its a unicode which each unique char has a numeric value
        System.out.println(myChar);
        // this will output: D
        System.out.println(myUnicode);
        // this will output: D
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        // this will output: ©
        // to find these unicode numbers go to unicode-table.com

        // BOOLEAN
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
        // boolean variables are written in form of question like above




    }
}
