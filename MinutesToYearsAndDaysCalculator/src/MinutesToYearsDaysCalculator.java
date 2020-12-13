public class MinutesToYearsDaysCalculator {
    // CHALLENGE
    // Write a method printYearsAndDays with parameter of
    // type long named minutes
    // The method should not return anything (void) and it needs to calculate
    // the years and days from the minutes parameter

    // If the parameter is less than 0, print text "Invalid Value".

    // Otherwise, if the parameter is valid then it needs to print a message in the format
    // "XX min = YY y and ZZ d".
    // XX represents the original value minutes.
    // YY represents the calculated years.
    // ZZ represents the calculated days.

    // TIPS:
    // Use the remainder operator
    // 1 hour = 60 minutes
    // 1 day = 24 hours
    // 1 year = 365 days

    // MY VERSION - NOT QUITE RIGHT
//    public static void printYearsAndDays(long minutes) {
//        if(minutes < 0) {
//            System.out.println("Invalid value");
//        } else {
//        long hours = minutes / 60;
//        long days = hours / 24;
//        long years = days / 356;
//        long remainingDays = days % 365;
//        System.out.println(minutes + " min = " + years + " y and" + remainingDays + " d");
//    }

        // CORRECT VERSION

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {
            long days = (long) (minutes / 1440);
            long remainingMinutes = minutes % 1440;
            long years = 0;
            //calculate year only if number of days > 365
            if (days >= 365) {
                years = (long) (days / 365);
                //update days
                days = days % 365;
            }

            System.out.println(minutes + " min = " +
                    years + " y and " +
                    days + " d" );
        }

    }



    }
