// CHALLENGE
// A complex number is a number that can be expressed in the form
// a +bi, where a and b are real numbers, and i is a solution of the
// equation x2 = -1. Because no real number satisfies this equation, i
// is called an imaginary number.
// For complex number a + bi, a is called the real part, and b is
// called the imaginary part. To add or subtract two complex numbers,
// just add or subtract the corresponding real and imaginary parts. For
// instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i.
// For another, the sum of 3 + i and -1 + 2i is 2 + 3i.

// Write a class with the name ComplexNumber. The class needs two
// fields with name real and imaginary of type double. It represents
// the Complex Number.
// Write the following methods:
// Method named getReal without parameters, it needs to return the
// value of real field.
// Method named getImaginary without parameters, it needs to return
// the value of imaginary field.
// Method named add with two parameters real and imaginary of type
// double, it needs to add parameters to fields. In other words, it
// needs to do a complex number add operation as described above.
// Method named add with one parameter of type ComplexNumber. It
// needs to add the ComplexNumber parameter to the corresponding
// instance variables.
// Method named subtract with two parameters real and imaginary of type
// double, it needs to subtract parameters of fields, in other words,
// it needs to do a complex number subtract operation as described
// above.
// Method named subtract with one parameter other of type ComplexNumber
// It needs to subtract the other parameter from this complex number.

public class ComplexNumber {
    // MY SOLUTION -- INCORRECT

//    private double real;
//    private double imaginary;
//
//    public double getReal() {
//        return this.real;
//    }
//    public double getImaginary() {
//        return this.imaginary;
//    }
//    public void add(double real, double imaginary) {
//        this.real = real + imaginary;
//    }
//    public void add(ComplexNumber complexNumber) {
//        this.real = real + imaginary;
//    }
//    public void subtract(double real, double imaginary) {
//        this.real = real - imaginary;
//    }
//    public void subtract(ComplexNumber complexNumber) {
//        this.real = real - imaginary;
//    }

    // LIKE THIS:
    private double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(ComplexNumber number) {
        this.add(number.getReal(), number.getImaginary());
    }

    public void add(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void subtract(ComplexNumber number) {
        this.subtract(number.getReal(), number.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }
    // OR LIKE THIS:
//    private double real;
//    private double imaginary;
//
//    public ComplexNumber(double real, double imaginary) {
//        this.real = real;
//        this.imaginary = imaginary;
//    }
//
//    public double getReal() {
//        return real;
//    }
//
//    public double getImaginary() {
//        return imaginary;
//    }
//
//    public void add(double real, double imaginary) {
//        this.real += real;
//        this.imaginary += imaginary;
//    }
//
//    public void add(ComplexNumber complexNumber) {
//        add(complexNumber.real, complexNumber.imaginary);
//    }
//
//    public void subtract(double real, double imaginary) {
//        this.real -= real;
//        this.imaginary -= imaginary;
//    }
//
//    public void subtract(ComplexNumber complexNumber) {
//        subtract(complexNumber.real, complexNumber.imaginary);
//    }
}
