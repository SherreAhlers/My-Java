// CHALLENGE
// Write a method named printSquareStar with one parameter of type
// int named number.
// if number is < 5, the method should print "Invalid Value".
// The method should print diagonals to generate a rectangular
// pattern composed of stars (*). This should be accomplished by
// using loops

// The pattern using above consitst of a number of rows and columns
// (where number is the number of rows to print). For each row or
// column, stars are printed based on four conditions.
// In the first or last row.
// In the first or last column.
// When the row number equals the column number.
// When the column number equals rowCount - currentRow + 1
// (where currentRow is current row number)

// HINT:
// Use a nested loop (a loop inside a loop).
// To print on the same line, use the print method instead of prinllm,
// e.g. System.out.print();
// To move to another line, you can use an empty println call, e.g.
// System.out.println();

public class DiagonalStar {
    // MY VERSION - INCORRECT

//    public static void printSquareStar(int number) {
//        if (number < 5) {
//            System.out.println("Invalid Value");
//        }
//        int row = 0;
//        int column = 0;
//
//    }
    // CORRECT VERSION:
public static void printSquareStar(int number) {
    if (number < 5) {
        System.out.println("Invalid Value");
    } else {
        for (int a=0;a<number;a++){
            for (int b=0;b<number;b++){
                if ((a==b)||(a==0)||(b==0)||(b==number-1)||(a==number-1)||(a+b==number-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

    // OR LIKE THIS:
//    public static void printSquareStar(int number) {
//        if (number < 5) {
//            System.out.println("Invalid Value");
//        }
//        else {
//            for (int row = 0; row < number; ++row) {
//                for (int column = 0; column < number; ++column) {
//                    if (row == 0 || row == number - 1) {
//                        System.out.print("*");
//                    } else if (column == 0 && row != 0 && row != number - 1) {
//                        System.out.print("*");
//                    } else if (row == column) {
//                        System.out.print("*");
//                    } else if (column == (number - (row + 1))) {
//                        System.out.print("*");
//
//                    } else if (column == number - 1 && row != 0 && row != number - 1) {
//                        System.out.print("*");
//                    } else if (row != column) {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println("");
//            }
//        }
//    }

}
