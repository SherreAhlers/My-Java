// 2. Write a class with the name Cuboid that extends
// Rectangle class. The class needs one field (instance variable) with
// the name height of type double.
// The class needs to have one constructor with three parameters
// width, length, and height all of type double. It needs to call
// parent constructor and initialize the height field.
// In case the height parameter is less than 0 it needs to set the
// height value to 0.
// Write the following methods:
// Method named getHeight without any parameters, it needs to return
// the value of height field.
// Method named getVolume without parameters, it needs to return the
// calculated volume. To calculate volume multiply area with height.


// MY VERSION _ CORRECT!

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getArea() * this.height;
    }
}
