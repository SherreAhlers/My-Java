package academy.learnprogramming;

public class Main {
    // CHALLENGE
    // For this challenge, create an abstract class to define the
    // items that can be stored in a list.
    // The class should contain 2 references to items which will
    // represent the next and previous items (in the case of a
    // linked list).
    // I.e., if you call your abstract class ListItem, then it
    // would have 2 member variables of type ListItem that will
    // hold references to the next/right and previous/left ListItems.

    // The abstract class will also need to hold a value - try to be
    // as flexible as possible when defining the types of this value.

    // The class will also need methods to move the next item and
    // back to the previous item, and methods to set the next and
    // previous items.

    // You should also specify a compareTo() method that takes a
    // parameter of the same type as the class and returns 0 if
    // the values are equal, greater than 0 if the value sorts
    // greater than the parameter and less than 0 if it sorts
    // less than the parameter.

    // Create a concrete class from your abstract list item class
    // and use this in a LinkedList class to implement a linked
    // list that will add items in order (so that they are sorted
    // alphabetically). Duplicate values are not added.

    // NOTE that you are creating your own LinkedList class here,
    // not using the built in Java one.

    // The rules for adding an item to the LinkedList are:
    // If the head of the list is null, make the head refer to the
    // item to be added.
    // If the item to be added is less than the current item in
    // the list, add the item before the current item (i.e. make
    // the previous item's next refer to the new item, and the
    // new item's "next" refer to the current item).
    // If the item to be added is greater than the current item,
    // move onto the next item and compare again (if there is no
    // next item then that is where the now item belongs).

    // Care will be needed when inserting before the first item
    // in the list (as it will not have a previous item).

    // You will also need a method to remove an item from the list.

    // HINT:
    // If you are creating classes with names such as List,
    // LinkedList, Node, etc. make sure that you create your
    // classes before referring to them. In previous videos we have
    // often referred to classes that we create later, but if
    // you use names that IntelliJ recognizes as Java classes
    // (such as LinkedList) then it will create imports for
    // them and possibly cause problems for you later.

    // Optional:
    // Create a class to use your concrete class to implement a
    // Binary Search Tree:
    // When adding items to a Binary Search Tree, if the item
    // to be added is less than the current item then move to
    // the left, if it is greater than the current item then
    // move to the right.

    // The new item is added when an attempt to move in the
    // required direction would involve following a null reference.
    // Once again, duplicates are not allowed.




    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
//        // Create a string data array to avoid typing loads of addItem instructions:
//        String stringData = "5 7 3 9 8 2 1 0 4 6";
//
//        String[] data = stringData.split(" ");
//        // the space will seperate the string items
//        for (String s : data) {
//            // create new item with value se to the string s
//            list.addItem(new Node(s));
//        }
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("3"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("5"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("0"));
//        list.removeItem(new Node("4"));
//        list.removeItem(new Node("2"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("9"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("8"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("6"));
//        list.traverse(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.traverse(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.traverse(list.getRoot());

        // all of the above will output:
        // The list is empty.
        // 0
        // 1
        // 2
        // 3
        // 4
        // 5
        // 6
        // 7
        // 8
        // 9
        // Deleting item 3
        // 0
        // 1
        // 2
        // 4
        // 5
        // 6
        // 7
        // 8
        // 9
        // Deleting item 5
        // 0
        // 1
        // 2
        // 4
        // 6
        // 7
        // 8
        // 9
        // Deleting item 0
        // Deleting item 4
        // Deleting item 2
        // 1
        // 6
        // 7
        // 8
        // 9
        // Deleting item 9
        // 1
        // 6
        // 7
        // 8
        // Deleting item 8
        // 1
        // 6
        // 7
        // Deleting item 6
        // 1
        // 7
        // Deleting item 1
        // 7
        // Deleting item 7
        // The list is empty.

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        // Create a string data array to avoid typing loads of addItem instructions:
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        // the space will separate the string items
        for (String s : data) {
            // create new item with value se to the string s
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
    }

}
