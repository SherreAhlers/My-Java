package academy.learnprogramming;

import java.util.List;

public abstract class ListItem {
    // these are my two variables
    // they are protected instead of private because we need to
    // be able to access them from concrete subclass.

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
        // this is my constructor
    }

    // these are my abstract classes we want to use
    abstract ListItem next();
    // returns reference of next item
    abstract ListItem setNext(ListItem item);
    // this saves the item
    abstract ListItem previous();
    // this returns the previous entry
    abstract ListItem setPrevious(ListItem item);
    // this sets the previous item

    abstract int compareTo(ListItem item);
    // this will return the int and will compare and see if
    // Object is same


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
