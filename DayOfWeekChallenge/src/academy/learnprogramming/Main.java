package academy.learnprogramming;

public class Main {
    // CHALLENGE
    // Write a method with the name printDayOfTheWeek that has
    // one parameter of type int and name it day.
    // The method should not return any value (void).
    // Using the switch statement print
    // "Sunday", "Monday", ... "Saturday" if the int parameter
    // "day" is 0, 1, ..., 6 respectively, otherwise should print
    // "Invalid day".

    // Bonus:
    // Write a seond solution using if then else, instead of switch.

    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

    }
    // MY VERSION -- CORRECT!
    public static void printDayOfTheWeek(int day) {
//        switch(day) {
//            case 0:
//                System.out.println("Monday");
//                break;
//
//            case 1:
//                System.out.println("Tuesday");
//                break;
//
//            case 2:
//                System.out.println("Wednesday");
//                break;
//
//            case 3:
//                System.out.println("Thursday");
//                break;
//
//            case 4:
//                System.out.println("Friday");
//                break;
//
//            case 5:
//                System.out.println("Saturday");
//                break;
//
//            case 6:
//                System.out.println("Sunday");
//                break;
//
//            default:
//                System.out.println("Invalid day");
//        }


        if(day == 0) {
            System.out.println("Monday");
        } else if (day == 1) {
            System.out.println("Tuesday");
        } else if (day == 2) {
            System.out.println("Wednesday");
        } else if (day == 3) {
            System.out.println("Thursday");
        } else if (day == 4) {
            System.out.println("Friday");
        } else if (day == 5) {
            System.out.println("Saturday");
        } else if (day == 6) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }

}
