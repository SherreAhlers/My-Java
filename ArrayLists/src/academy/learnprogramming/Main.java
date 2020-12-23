package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void addItem() {
        System.out.print("Please enter the grocery item:");
        groceryList.addGroceryItem(scanner.nextLine());
        // this will allow us to type anything before the enter is
        // pressed (multiple word inputs).
    }
    public static void modifyItem() {
        System.out.print("Current item number: ");
//        int itemNumber = scanner.nextInt();
        String itemNumber = scanner.nextLine();
        System.out.println("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber, newItem);
        // we are deducting 1 off the itemNumber to make it start at 1
        // instead of 0.
    }
    public static void removeItem() {
        System.out.println("Enter item number: ");
//        int itemNumber = scanner.nextInt();
        String itemNumber = scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber);
    }
    public static void searchForItem() {
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " is in the shopping list.");
        } else {
            System.out.println(searchItem + " is not in the shopping list.");
        }
    }
    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        // this is an easier way of copying an array.

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        // another handy way of copying a whole string and saving to new array

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
        // returning an array of strings copied from array.
    }
}
// all of this will output:
// Press
//	 0 - To print choice options.
//	 1 - To print list of grocery items.
//	 2 - To add an item to the list.
//	 3 - To modify an item in the list.
//	 4 - To remove an item from the list.
//	 5 - To search for an item in the list.
//	 6 - To quit the application.
// Enter your choice:
// 2
// Please enter the grocery item: milk
// it all depends on what is selected.


