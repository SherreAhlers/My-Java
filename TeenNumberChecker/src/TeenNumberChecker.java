public class TeenNumberChecker {
    // MY VERSION - CORRECT!

    public static boolean hasTeen(int one, int two, int three) {
        if((one >= 13 && one <= 19) || (two >= 13 && two <= 19 ) || (three >= 13 && three <= 19 )) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isTeen(int age) {
        if(age >= 13 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }
}