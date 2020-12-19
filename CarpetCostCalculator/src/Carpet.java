// 2. Write a class with the name Carpet. The class needs one field
// with name cost of type double.
// The class needs to have one constructor with parameter cost of
// type double and it needs to initialize the field.
// In case the cost parameter is less than 0 it needs to set the field
// value to 0.
// Write the following methods:
// Method named getCost without parameters, it needs to return the
// value of cost field.


public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if(cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }
    // OR LIKE THIS:
//    private double cost;
//
//    public double getCost() {
//        return cost;
//    }
//
//    public Carpet(double cost) {
//        this.cost = (cost < 0) ? 0 : cost;
//    }
//}

}
