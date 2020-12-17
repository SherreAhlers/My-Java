// CHALLENGE
// Write a method named canPack with three parameters of type int
// named bigCount, smallCount, and goal.
// The parameter bigCount represents the count of big flour bags
// (5 kilos each).
// The parameter smallCount represents the count of small flour
// bags (1 kilo each).
// The parameter goal represents the goal amount of kilos of flour
// needed to assemble a package.
// Therefore, the sum of the kilos of bigCount and smallCount must be
// at least equal to the value of goal. The method should return
// true if it is possible to make a package with goal kilos of flour.
// If the sum is greater than goal, ensure that only full bags are used
// towards the goal amount.
// For example, if goal = 9, bigCount = 2, and smallCount = 0, the
// method should return false since each big bag is 5 kilos and cannot
// be divided.
// However, if goal = 9, bigCount = 1, and smallCount = 5, the method
// should return true because of 1 full bigCount and 4 smallCount bags
// equal goal, and its okay if there are additional bags left over.
// If any of the parameters are negative, return false.



public class FlourPacker {
    // MY VERSION _ INCORRECT!
//    public static boolean canPack (int bigCount, int smallCount, int goal) {
//        int sum = bigCount + smallCount;
//        bigCount = bigCount * 5;
//        if(bigCount + smallCount != goal) {
//            return false;
//        } else {
//            return true;
//        }
    // CORRECT VERSION:

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        bigCount *= 5;
        if (bigCount + smallCount >= goal) {
            if (smallCount >= goal % 5) {
                return true;
            }
        }
        return false;
    }

    // OR LIKE THIS:
//        public static boolean canPack(int bigCount,int smallCount,int goal){
//            if(bigCount < 0 || smallCount < 0 || goal < 0){
//                return false;
//            }
//            bigCount = bigCount * 5;
//            if(bigCount == goal || (bigCount < goal && smallCount != 0 && (bigCount + smallCount) >= goal)|| (bigCount == 0 && smallCount >= goal)){
//                return true;
//            }else if(bigCount > goal){
//                while(bigCount !=5){
//                    bigCount = bigCount - 5;
//                    if(bigCount <= goal  && (bigCount + smallCount) >= goal){
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }
    }
