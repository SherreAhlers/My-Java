// CHALLENGE
// Bob is a wall painter and he needs your help. You have to write a
// program that helps Bob calculate how many buckets of paint he
// needs to buy before going to work. Bob might also have some extra
// buckets at home. He also knows the area that he can cover with one
// bucket of paint.
// 1. Write a method named getBucketCount with 4 parameters.
// The first parameter should be named width of type double.
// The parameter represents the width of the wall.
// The second parameter should be named height of type double.
// This parameter represents the height of the wall.
// The third parameter should be named areaPerBucket.
// This parameter represents the area that can be covered with one
// bucket of paint.
// The fourth parameter should be named extraBuckets.
// This parameter represents the bucket count that Bob has at home.

// The method needs to return a value of type int that represents the
// number of buckets Bob needs to buy before going to work.
// To calculate the bucket count, refer to notes below.

// If one parameters width, height or areaPerBucket is less or equal
// to 0 or if extraBuckets is less than 0, the method needs to return
// -1 to indicate invalid value.

// If all parameters are valid, the method needs to calculate the
// number of buckets and return it.

// 2. Bob does not like to enter 0 for the extraBuckets parameter so
// he needs another method.

// Write another overloaded method named getBucketCount with 3
// parameters namely width, height, and areaPerBucket (all type double)
// This method needs to return a value of type int that represents the
// number of buckets that Bob needs to buy before going to work.

// If one of the parameters width, height, or areaPerBucket is less
// or equal to 0, the method needs to return -1 to indicate an
// invalid value.

// If all parameters are valid, the method needs to calculate the
// number of buckets and return it.

// 3. In some cases, Bob does not know the width and height of the
// wall but he knows the area of a wall. He needs you to write another
// method.

// Write another overloaded method named getBucketCount with 2 parameters
// namely, area and areaPerBucket (both type double).
// The method needs to return a value of type int that represents the number
// of buckets that Bob needs to buy before going to work.

// If one parameter area or areaPerBucket is less or equal to 0,
// the method needs to return -1 to indicate an invalid value.
// If all parameters are valid, the method needs to calculate the
// number of buckets and return it.

// NOTE:
// Use the method Math.ceil to round the number of calculated buckets
// (double) then convert it into an int before returning value from
// the method.

public class PaintJob {
    // MY VERSION -- super close...
//    // 1.
//    public static int getBucketCount
//    (double width, double height, double areaPerBucket, double extraBuckets) {
//        if(((width <= 0) || (height <= 0)
//                || (areaPerBucket <= 0) || (extraBuckets <= 0))) {
//            return -1;
//        } else {
////            double areaOfWall = width * height;
////            areaOfWall /= areaPerBucket;
////            double extras = areaOfWall - extraBuckets;
//            return (int)Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
//        }
//    }
//    // 2.
//    public static int getBucketCount
//    (double width, double height, double areaPerBucket) {
//        if ((width <= 0) || (height <= 0)
//                || (areaPerBucket <= 0)); {
//            return -1;
//        } else {
//        return (int)Math.ceil((width * height) / areaPerBucket);
//
//            }
//    }
//    // 3.
//    public static int getBucketCount (double area, double areaPerBucket) {
//        if(area <= 0 || areaPerBucket <= 0) {
//            return -1;
//        } else {
//            return (int)Math.ceil(area / areaPerBucket);
//        }
//    }
// CORRECT VERSION:
public static int  getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
    if( width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets  < 0) {
        return -1;
    }
    return    (int)Math.ceil (((width*height)/areaPerBucket)-extraBuckets);
}
    public static int  getBucketCount(double width,double height,double areaPerBucket ){
        if( width<= 0 || height<=0 || areaPerBucket<=0  ) { return -1; }
        return    (int)Math.ceil ((width*height)/areaPerBucket) ;
    }
    public static int  getBucketCount( double area,double areaPerBucket ){
        if(area<=0 || areaPerBucket<=0) { return -1; }
        return    (int)  Math.ceil (area/areaPerBucket)  ;
    }
    // OR LIKE THIS:
//    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
//        double wallArea = width * height;
//        double areaCanCover = areaPerBucket * extraBuckets;
//        int count = 0;
//        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
//            return -1;
//        }else {
//            if(areaCanCover > wallArea){
//                return 0;
//            }
//            while (areaCanCover < wallArea){
//                areaCanCover += areaPerBucket;
//                count++;
//            }
//        }
//        return count;
//    }
//    public static int getBucketCount(double width, double height, double areaPerBucket){
//        double wallArea = width * height;
//        double areaCovered = 0;
//        int count = 0;
//        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
//            return -1;
//        }
//        while(areaCovered < wallArea){
//            count++;
//            areaCovered = areaPerBucket * count;
//        }
//        return count;
//    }
//    public static int getBucketCount(double area, double areaPerBucket){
//        double areaCovered = 0;
//        int count = 0;
//        if(area <= 0 || areaPerBucket <= 0){
//            return -1;
//        }
//        while(areaCovered < area){
//            count++;
//            areaCovered = areaPerBucket * count;
//        }
//        return count;
//    }
}