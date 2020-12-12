package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // type psvm and tab to get above
        long miles = academy.learnprogramming.SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);
        // this will output: Miles = 7.0
        //                  10.5 km/h= 7 mi/h

        academy.learnprogramming.SpeedConverter.printConversion(10.5);
        // COMMAND + C will highlight line
    }
}
