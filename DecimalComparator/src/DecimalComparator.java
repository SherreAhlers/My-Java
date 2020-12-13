public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {

        one = one * 1000;
        two = two * 1000;

        int testOne = (int) one;
        int testTwo = (int) two;

        if(testOne == testTwo) {
            return true;
        } else {
            return false;
        }
    }
}
