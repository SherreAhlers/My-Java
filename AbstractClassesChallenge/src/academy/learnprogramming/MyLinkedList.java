package academy.learnprogramming;

import javax.swing.*;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        // need to check for new item first
        if (this.root == null) {
            // the list was empty so this item becomes the head.
            this.root = newItem;
            // this will pass the new item and will be set to head.
            return true;
            // we have succeeded in adding item
        }
        ListItem currentItem = this.root;
        // need to start comparing from head of list
        while (currentItem != null) {
            // while there are still items... once we reach null the loop is over
            int comparison = currentItem.compareTo(newItem);
            // this is where we compare items
            if (comparison < 0) {
                // new item is greater need to move right if possible
                if (currentItem.next() != null) {
                    // if we can still go forward
                    currentItem = currentItem.next();
                    // need to continue processing
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    // this sets the new item
//                    newItem.setPrevious(currentItem);
                    // this sets the previous item.
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, insert before
                if (currentItem.previous() != null) {
                    // insert before
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    // set current item .previous to set value of new item
//                    newItem.setPrevious(currentItem.previous()));
                    // then go in and set what previous would be
                    newItem.setNext(currentItem).setPrevious(newItem);
//                    currentItem.setPrevious(newItem);
                } else {
                    // the node without a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
//                    this.root.setPrevious(newItem);
                    this.root = newItem;
                    // now the head will become this new item
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        // traverse list to find item to be removed
        // then set previous link to point to deleted link.
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();

                    // test to see if this is the root - if it is the head
                    // this will set new root to point at next record
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    // bypassing this record that will be deleted
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {  // comparison > 0
                // We are at an item greater than the one to be deleted.
                // so the item is not in the list.
                return false;
            }
        }
        return false;
    }


    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty.");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
