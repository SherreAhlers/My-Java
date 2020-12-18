package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//       Car porsche;
       // Here we are defining a object of type Car called porsche.
        // when creating a new class must initialize it.
        Car porsche = new Car();
        // we created an object called porsche based on template called
        // Car.
        Car holden = new Car();
        // Java has added behind the scenes methods that are accessible
        // on the object

        System.out.println("Model is " + porsche.getModel());
        // this will output: Model is null
//        porsche.model = "Carrera";
        // the above violates the rules of encapsulation.
        porsche.setModel("Carrera");
        // there are no default data types for fields
        System.out.println("Model is " + porsche.getModel());
        // this will output: Model is Carrera


    }
}
