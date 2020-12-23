package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList <String> groceryList = new ArrayList<String>();
    // the above syntax tells Java we are creating an array list
    // with data type String
    // ArrayList can hold objects
    public void addGroceryItem(String item) {
        groceryList.add(item);
        // this automatically adds item into array list.
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size());
        // size will return how many elements are currently in list.
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ", " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
        // this printout will start at 1 since humans don't start count at 0
    }
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }
//    public String findItem(String searchItem) {
//        // this will allow us to look into array and find a particular
//        // item.
////        boolean exists = groceryList.contains(searchItem);
//        // the contains has been optimized by Java and it will return
//        // true or false if it can find item or not.
//
//        // now we want to return the item back
//        int position = groceryList.indexOf(searchItem);
//        // this finds the item and returns the indexOf the item
//        if(position >= 0) {
//            return groceryList.get(position);
//            // this will check if number return is greater than or
//            // equal to 0, if it has it will return the item, if it
//            // is not it will return null.
//        }
//        return null;
//    }
    // OR LIKE THIS _ BETTER WAY
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }
}
