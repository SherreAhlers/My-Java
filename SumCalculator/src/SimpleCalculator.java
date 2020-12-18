// CHALLENGE
// Write a class with the name SimpleCalculator. The class needs two
// fields (instance variables) with names firstNumber and secondNumber
// both of type double.
// Write the following methods (instance methods):
// Method named getFirstNumber without any parameters, it needs to
// return the value of firstNumber field.
// Method named getSecondNumber without any parameters, it needs to
// return the value of the secondNumber field.
// Method named getFirstNumber with one parameter of type double,
// it needs to set the value of the firstNumber field.
// Method named getSecondNumber with one parameter of type double,
// it needs to set the value of the secondNumber field.
// Method named getAdditionResult without any parameters, it needs
// to return the result of adding the field values of firstNumber
// and secondNumber.
// Method named getSubtractionResult without any parameters, it
// needs to return the result of subtracting the field values of
// secondNumber from firstNumber.
// Method named getMultiplicationResult without any parameters,
// it needs to return the result of multiplying the field values
// of firstNumber and secondNumber.
// Method named getDivisionResult without any parameters, it needs
// to return the result of dividing the field value of firstNumber
// by the secondNumber. In case the value of the secondNumber
// is 0 then return 0.

public class SimpleCalculator {
    // MY VERSION -- SUPER CLOSE!
//    private double firstNumber;
//    private double secondNumber;
//
//    public double getFirstNumber() {
//        return this.firstNumber;
//    }
//
//    public double getSecondNumber() {
//        return this.secondNumber;
//    }
//
//    public void setFirstNumber(double firstNumber) {
//        this.firstNumber = firstNumber;
//    }
//
//    public void setSecondNumber(double secondNumber) {
//        this.secondNumber = secondNumber;
//    }
//
//    public double getAdditionResult() {
////        return firstNumber + secondNumber;
//        // should be:
//        return (getFirstNumber() + getSecondNumber());
//    }
//
//    public double getSubtractionResult() {
////        return firstNumber - secondNumber;
//        // should be:
//        return (getFirstNumber() - getSecondNumber());
//    }
//
//    public double getMultiplicationResult() {
////        return firstNumber * secondNumber;
//        return (getFirstNumber() * getSecondNumber());
//    }
//
//    public double getDivisionResult() {
////        if (secondNumber == 0.0) {
////            return 0.0;
////        } else {
////            return secondNumber / firstNumber;
////        }
//        // should be:
//        return (getSecondNumber() == 0.0) ? 0 : (getFirstNumber() / getSecondNumber());
//    }
    // CORRECT VERSION
    private double firstNumber;
    private double secondNumber;

    public  double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        double total = getFirstNumber() + getSecondNumber();
        return total;
    }
    public double getSubtractionResult(){
        double total = getFirstNumber() - getSecondNumber();
        return total;
    }
    public double getMultiplicationResult(){
        double total = getFirstNumber() * getSecondNumber();
        return total;
    }
    public double getDivisionResult(){
        if(this.secondNumber == 0){
            return 0.0;
        }else{
            double total = firstNumber / secondNumber;
            return total;
        }
    }
}
