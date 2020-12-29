package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // packages are a way of grouping classes together
//        javafx.scene.Node node = null;
        // here we are specifying the package
        // this package is not built in so would always have to type it out.
//        org.w3c.dom.Node anotherNode = null;

        // Scanner is a package, as well as java.import.util.array
        MyWindow myWindow = new MyWindow("Complete Java");
        myWindow.setVisible(true);
    }
}
