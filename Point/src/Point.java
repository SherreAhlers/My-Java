// CHALLENGE
// You have to represent a point in 2D space. Write a class with the
// name Point. The class needs two fields with names x and y of type
// int.

// The class needs to have two constructors. The first constructor
// doesn't have any parameters.
// The second constructors has parameters x and y of type int and
// it needs to initialize the fields.

// Write the following methods:
// Method named getX without parameters, it needs to return the value
// of x field.
// Method named getY without parameters, it needs to return the value
// of y field.
// Method setX with one parameter of type int, it needs to set the
// value of x field.
// Method setY with one parameter of type int, it needs to return the
// value of y field.
// Method named distance with two parameters x and y both of type int,
// it needs to return the distance between this Point and Point x, y
// as double.
// Method named distance with another type Point, it needs to return
// the distance between this Point and another Point as double.

// How to find the distance between two points?
// To find the distance between points A(xA, yA) and B(xB, yB), we
// use the formula:
// d(A, B) = SR (xB - xA) * (xB - yA) * (yB - yA)
// where SR represents square root
// HINT:
// Use Math.sqrt() to calculate the square root.
public class Point {
    private int x;
    private int y;

    public Point() {

    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
//    public int distance(int x, int y) {
//        int distance = Math.sqrt((x - y) * (x - y) * (x - y);
//        return distance;
//    }
    public double distance() {
        return Math.sqrt(((0 - x) * (0 - x)) + ((0 - y) * (0 - y)));
    }
    // this part I looked up from other students - couldn't quite figure out how to complete.
    public double distance(int a, int b) {
        return Math.sqrt(((a - x) * (a -x)) + ((b - y) * (b - y)));
    }
    public double distance(Point another) {
        return Math.sqrt(((another.getX() - x) * (another.getX() - x)) + ((another.getY() - y) * (another.getY() - y)));
    }
    // OR LIKE THIS:

//    private int x;
//    private int y;
//
//    public Point() {
//        this.x = 0;
//        this.y = 0;
//    }
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int getX() {
//        return this.x;
//    }
//
//    public int getY() {
//        return this.y;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public double distance() {
//        return Math.sqrt((this.x - 0.0) * (this.x - 0.0) + (this.y - 0.0) * (this.y - 0.0));
//    }
//
//    public double distance(int x, int y) {
//        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
//    }
//
//    public double distance(Point another) {
//        return Math.sqrt((this.x - another.x) * (this.x - another.x) + (this.y - another.y) * (this.y - another.y));
//    }
}
