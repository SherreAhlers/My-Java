package academy.learnprogramming;

public class Main {
    // CHALLENGE
    // Create a method called getDurationString with two parameters
    // first parameter minutes
    // second parameter seconds
    // You should validate the first parameter minutes is >= 0
    // You should validate the second parameter seconds is >= 0 and <= 59
    // The method should return "Invalid value" in the method if either of the above are not true
    // If the parameters are valid then calculate how many hours,
    // minutes and seconds equal the minutes and seconds passed to this method
    // and return that value as string in format "XXh YYm ZZs" where
    // XX represents a number of hours
    // YY the minutes and
    // ZZ the seconds.

    // Create a 2nd method of the same name but with only one parameter seconds
    // Validate that it is >= 0, and return "Invalid value" if it is not true
    // If it is valid then calculate how many minutes are in the seconds
    // calculated so that it can calculate correctly
    // Call both methods to print values to console.

    // Tips: Use int or long for your number data types is probably a good idea
    // 1 hour = 60 seconds and 1 hour = 60 minutes or 3600 seconds.

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    // final means you cannot change the value


    public static void main(String[] args) {

        // Bonus:
        // For the input 61 minutes output should be 01h 01 m 00s
        // tip: use else-if
        System.out.println(getDurationString(65, 45));
        // this will output: 1h 5m 45s
        System.out.println(getDurationString(3945L));
        // this will output: 1h 5m 45s
        System.out.println(getDurationString(-41L));
        // this will output: Invalid value
        System.out.println(getDurationString(65, 9));
        // this will output: 1 05m 09s
    }
    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || seconds > 59) {
            // return "Invalid value";
            // instead of above do:
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        // Bonus:
        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
            // the above will add a 0 to the beginning if hours is less than 10
        }

        String minutesString = remainingMinutes + "m";
        if(remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hours + " " + minutesString + " " + secondsString + "";
        // this will return: 1h 5m 45s
    }
    private static String getDurationString(long seconds) {
        if (seconds < 0) {
//            return "Invalid value";
            // instead of above do:
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}



