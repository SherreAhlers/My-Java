public class LeapYear {

    // MY VERSION - CORRECT!
    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 9999) {
            return false;
        } else
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else return false;
                } else return true;
            } else return false;
}
        // A one line version

//        return ((year >= 1 && year <= 9999) && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)));
//    }
}
