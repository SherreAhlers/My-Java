// 3. Write a class with the name Calculator. The class needs two
// fields with name floor of type Floor and carpet of type Carpet.
// The class needs to have one constructor with parameters floor of type
// Floor and carpet of type Carpet and it needs to initialize the fields.
// Write the following methods:
// Method named getTotalCost without parameters, it needs to return
// the calculated total cost to cover the floor with carpet.

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }
    // OR LIKE THIS:
//    public class Calculator {
//        private Floor floor;
//        private Carpet carpet;
//
//        public Calculator(Floor floor, Carpet carpet) {
//            this.floor = floor;
//            this.carpet = carpet;
//        }
//
//        public double getTotalCost() {
//            return floor.getArea() * carpet.getCost();
//        }
}
