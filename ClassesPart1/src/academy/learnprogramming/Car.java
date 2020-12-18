package academy.learnprogramming;

import java.util.Locale;

public class Car {
    // Classes
    // To create a new class on left side click src - project folder
    // academy.learnprogramming - right click and select new class
    // class is a template or blueprint for creating objects
    // class benefits - class can be thought of user defined
    // data type - enable you to have user defined type.

    // public keyword is means unrestricted access to class by other classes
    // there is private which no other class can see or use.
    // private is ad hearing to encapsulation which is used to hide fields
    // of class
    // etc.

    // generally go with private when creating a variable in class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    // the above variables are considered fields.

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            // this says if model == carrera or model == commodore
            // typing .equals is only for string comparison
            this.model = model;
            // typing this. will call on the field above.
            // NEED THE THIS
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model;
    }
}
